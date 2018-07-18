package collection.games.rpg.heros;

import collection.games.rpg.Character;
import collection.games.rpg.races.Race;

public class Hero extends Character {

    public Hero(Race race, String name, int health, int strength, int intelligence, int agility) {
        super(race, name, health, strength, intelligence, agility);
    }

    public int attack() {
        return 0;
    }

}
