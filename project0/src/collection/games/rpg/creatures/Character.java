package collection.games.rpg.creatures;

import collection.games.rpg.creatures.races.Race;

public class Character extends Creature {

    protected Race race;

    protected Character(Race race, String name, int strength, int intelligence, int agility) {
        super(name, strength, intelligence, agility);
        this.race = race;

        double raceHealthCoefficient = race.getHealthCoefficient();
        health = (int)(health * raceHealthCoefficient);
    }

}
