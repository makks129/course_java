package collection.games.rpg.creatures.mosters;

import collection.games.rpg.creatures.Reputation;

public abstract class Boss extends Monster {

    public Boss(String name, int strength, int intelligence, int agility) {
        super(name, strength, intelligence, agility);
        reputation = Reputation.HOSTILE;
    }

    @Override
    public double getHealthCoefficient() {
        return 10;
    }

    @Override
    public boolean canPutIntoInventory() {
        return false;
    }
}
