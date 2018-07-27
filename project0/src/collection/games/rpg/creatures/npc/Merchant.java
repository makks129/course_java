package collection.games.rpg.creatures.npc;

import collection.games.rpg.creatures.races.Race;

public class Merchant extends Npc {

    public Merchant(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
    }

    @Override
    public String[] actionsOnTarget() {
        return new String[]{"Greet", "Trade"};
    }
}
