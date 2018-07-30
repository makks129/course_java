package collection.games.rpg.locations;

import collection.games.rpg.creatures.heros.Hero;

import java.util.LinkedList;
import java.util.List;

// TODO player enter/exit announcement
public abstract class Location {

    protected String name;
    protected List<Hero> heroes; // spaces for heroes, not every element is a Hero, some are null!

    public Location(String name) {
        this.name = name;
        heroes = new LinkedList<>(); // each location can host maximum a 100 heroes
    }

//    protected abstract void announceHeroEnterLocation(Hero hero);

//    protected abstract void announceHeroExitLocation(Hero hero);

    public void changeLocation(Hero hero) {
        Location currentLocation = hero.getCurrentLocation();
        if (currentLocation != null) {
            currentLocation.removeHero(hero);
        }
        addHero(hero);
    }

    private void addHero(Hero hero) {
        heroes.add(hero);
        hero.setCurrentLocation(this);
    }

    private void removeHero(Hero hero) {
        heroes.remove(hero);
        hero.setCurrentLocation(null);
    }

    public String getName() {
        return name;
    }
}
