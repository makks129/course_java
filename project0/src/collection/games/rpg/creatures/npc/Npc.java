package collection.games.rpg.creatures.npc;

import collection.games.rpg.creatures.Character;
import collection.games.rpg.creatures.races.Race;
import collection.games.rpg.interfaces.Targetable;

public class Npc extends Character implements Targetable {

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

    @Override
    public String[] actionsOnTarget() {
        return new String[]{"Greet"};
    }

}
