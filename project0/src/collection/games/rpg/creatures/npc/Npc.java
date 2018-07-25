package collection.games.rpg.creatures.npc;

import collection.games.rpg.creatures.Character;
import collection.games.rpg.creatures.races.Race;

public class Npc extends Character {

    public Npc(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
    }

    @Override
    public double getHealthCoefficient() {
        return 1;
    }

    @Override
    public int attack() {
        return 0;
    }

}
