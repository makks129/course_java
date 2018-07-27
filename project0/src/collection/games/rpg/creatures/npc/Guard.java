package collection.games.rpg.creatures.npc;

import collection.games.rpg.creatures.races.Race;

public class Guard extends Npc {

    public Guard(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
    }

    @Override
    public int attack() {
        return 100;
    }

    @Override
    public String[] actionsOnTarget() {
        return new String[]{"Greet", "Attack"};
    }

}
