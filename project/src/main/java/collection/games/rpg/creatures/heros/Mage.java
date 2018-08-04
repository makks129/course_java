package collection.games.rpg.creatures.heros;

import collection.games.rpg.creatures.races.Race;

public class Mage extends Hero {

    public Mage(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
    }

    @Override
    public int attack() {
        return 200;
    }

    @Override
    public double getHealthCoefficient() {
        return 0.9;
    }
}
