package collection.games.rpg.creatures.heros;

import collection.games.rpg.creatures.Character;
import collection.games.rpg.creatures.races.Race;

public class Hero extends Character {

    protected Hero(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
    }

}
