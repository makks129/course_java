package collection.games.rpg.creatures.mosters;

public abstract class Boss extends Monster {

    public Boss(String name, int strength, int intelligence, int agility) {
        super(name, strength, intelligence, agility);
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
