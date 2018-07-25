package collection.games.rpg.locations;

import collection.games.rpg.creatures.heros.Hero;

// TODO Abs
// TODO player enter/exit announcement
public class Location {

    protected String name;
    protected Hero[] heroes; // spaces for heroes, not every element is a Hero, some are null!

    public Location(String name) {
        this.name = name;
        heroes = new Hero[100]; // each location can host maximum a 100 heroes
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
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == null) {
                heroes[i] = hero;
                return;
            }
        }
    }

    private void removeHero(Hero hero) {
        clearHeroSpace(hero);
        hero.setCurrentLocation(null);
    }

    private void clearHeroSpace(Hero hero) {
        for (int i = 0; i < heroes.length; i++) {
            Hero space = heroes[i]; // space can be null, so check for null first
            if (space != null && space.getName().equals(hero.getName())) { // checks for null first, if not null checks the name
                heroes[i] = null;
                return;
            }
        }
    }

    public String getName() {
        return name;
    }
}
