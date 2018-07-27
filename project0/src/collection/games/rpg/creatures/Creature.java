package collection.games.rpg.creatures;

import collection.games.rpg.interfaces.InventoryItem;
import collection.games.rpg.interfaces.Lootable;
import collection.games.rpg.items.Inventory;
import collection.games.rpg.items.Item;
import collection.games.rpg.items.Money;
import collection.games.rpg.items.Wallet;
import collection.games.rpg.locations.Location;

public abstract class Creature implements Lootable {

    protected String name;
    protected final Health hp;
    protected final Experience xp;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected Location currentLocation;
    protected Inventory inventory;
    protected Wallet wallet;

    protected Creature(String name, int strength, int intelligence, int agility) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        xp = new Experience(this);
        hp = new Health(getHealthCoefficient());
    }

    @Override
    public InventoryItem[] lootItems() {
        if (hp.isDead()) {
            InventoryItem[] itemsToLoot = inventory.getItems();
            inventory = new Inventory();
            return itemsToLoot;
        }
        return null;
    }

    @Override
    public Money lootMoney() {
        if (hp.isDead()) {
            Money moneyToLoot = wallet.getMoney();
            wallet.setMoney(Money.ZERO);
            return moneyToLoot;
        }
        return null;
    }

    public abstract double getHealthCoefficient();

    public abstract int attack();

    public String getName() {
        return name;
    }

    public Experience getExperience() {
        return xp;
    }

    public Health getHealth() {
        return hp;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
}
