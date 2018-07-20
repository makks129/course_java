package collection.games.rpg.creatures.heros;

import collection.games.rpg.creatures.races.Race;

public class Priest extends Hero{

    public Priest(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public double getHealthCoefficient() {
        return 0.8;
    }
}
