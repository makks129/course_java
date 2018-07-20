package collection.games.rpg.creatures;

import collection.games.rpg.creatures.races.Race;

public class Character extends Creature {

    protected Race race;

    public Character(Race race, String name, int health, int strength, int intelligence, int agility) {
        super(name, health, strength, intelligence, agility);
        this.race = race;
    }

}
