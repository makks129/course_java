package collection.games.rpg.creatures.mosters;

import collection.games.rpg.creatures.Creature;
import collection.games.rpg.creatures.Reputation;
import collection.games.rpg.interfaces.InventoryItem;
import collection.games.rpg.interfaces.Targetable;

public class Monster extends Creature implements Targetable, InventoryItem {

    private Reputation reputation;

    public Monster(String name, int strength, int intelligence, int agility) {
        super(name, strength, intelligence, agility);
    }

    @Override
    public double getHealthCoefficient() {
        return 0.2;
    }

    @Override
    public int attack() {
        return 50;
    }

    @Override
    public String[] actionsOnTarget() {
        if (reputation == Reputation.FRIENDLY) {
            return new String[]{"Pet"};
        } else {
            return new String[]{"Attack"};
        }
    }

    @Override
    public boolean canPutIntoInventory() {
        return reputation == Reputation.FRIENDLY;
    }

    @Override
    public String[] useActions() {
        return new String[]{"Release"};
    }
}
