package collection.games.rpg.creatures;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.Lootable;
import collection.games.rpg.items.Inventory;
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
    public void lootItems(Hero toHero) {
        if (hp.isDead()) {
            toHero.getInventory().getItems().addAll(inventory.getItems());
            inventory.getItems().clear();
        }
    }

    @Override
    public void lootMoney(Hero toHero) {
        if (hp.isDead()) {
            toHero.getWallet().addMoney(wallet.getMoney());
            wallet.setMoney(Money.ZERO);
        }
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

    public Inventory getInventory() {
        return inventory;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
