package collection.games.rpg.creatures;

import collection.games.rpg.creatures.races.Race;

public class Npc extends Character{

    public Npc(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
        health = 100;
    }

}
