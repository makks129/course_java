package collection.games.rpg;

import collection.games.rpg.races.Race;

public class Character extends Creature {

    protected Race race;

    public Character(Race race, String name, int health, int strength, int intelligence, int agility) {
        super(name, health, strength, intelligence, agility);
        this.race = race;
    }

}
