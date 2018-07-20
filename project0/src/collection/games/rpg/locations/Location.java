package collection.games.rpg.locations;

import collection.games.rpg.creatures.heros.Hero;

public class Location {

    protected String name;
    protected Hero[] heros; // spaces for heroes, not every element is a Hero, some are null!

    public Location(String name) {
        this.name = name;
        heros = new Hero[100]; // each location can host maximum a 100 heroes
    }

    public void addHero(Hero hero) {
        Location currentLocation = hero.getCurrentLocation();
        if (currentLocation != null) {
            currentLocation.removeHero(hero);
        }

        addHeroOnEmptySpace(hero);
        hero.setCurrentLocation(this);
    }

    private void addHeroOnEmptySpace(Hero hero) {
        for (int i = 0; i < heros.length; i++) {
            if (heros[i] == null) {
                heros[i] = hero;
                return;
            }
        }
    }

    private void removeHero(Hero hero) {
        clearHeroSpace(hero);
        hero.setCurrentLocation(null);
    }

    private void clearHeroSpace(Hero hero) {
        for (int i = 0; i < heros.length; i++) {
            Hero space = heros[i]; // space can be null, so check for null first
            if (space != null && space.getName().equals(hero.getName())) { // checks for null first, if not null checks the name
                heros[i] = null;
                return;
            }
        }
    }

    public String getName() {
        return name;
    }
}
