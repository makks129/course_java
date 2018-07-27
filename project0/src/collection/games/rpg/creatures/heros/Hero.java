package collection.games.rpg.creatures.heros;

import collection.games.rpg.creatures.Character;
import collection.games.rpg.creatures.Creature;
import collection.games.rpg.creatures.Reputation;
import collection.games.rpg.creatures.mosters.Monster;
import collection.games.rpg.creatures.races.Race;
import collection.games.rpg.interfaces.Targetable;

public abstract class Hero extends Character implements Targetable {

    protected Hero(Race race, String name, int strength, int intelligence, int agility) {
        super(race, name, strength, intelligence, agility);
    }

    @Override
    public String[] actionsOnTarget() {
        return new String[]{"Greet", "Trade", "Attack"};
    }

}
