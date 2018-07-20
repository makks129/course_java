package collection.games.rpg.creatures.heros;

import collection.games.rpg.creatures.races.Race;

public class Ranger extends Hero{

    public Ranger(Race race, String name, int health, int strength, int intelligence, int agility) {
        super(race, name, health, strength, intelligence, agility);
    }

    @Override
    public int attack() {
        return 30;
    }
}
