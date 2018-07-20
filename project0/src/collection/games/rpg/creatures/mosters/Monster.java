package collection.games.rpg.creatures.mosters;

import collection.games.rpg.creatures.Creature;

public class Monster extends Creature {

    public Monster(String name, int strength, int intelligence, int agility) {
        super(name,  strength, intelligence, agility);
        health = 200;
    }
}
