package collection.games.rpg.objects;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.InventoryItem;
import collection.games.rpg.interfaces.Lootable;
import collection.games.rpg.items.Inventory;
import collection.games.rpg.items.Item;
import collection.games.rpg.items.Money;

public abstract class Container extends GameWorldObject implements Lootable {

    private InventoryItem[] items;
    private Money money;

    public Container() {
        items = new InventoryItem[100]; // can contain max 100 items
        money = Money.ZERO;
    }

    @Override
    public void lootItems(Hero hero) {
        InventoryItem[] itemsToLoot = items;
        items = new InventoryItem[100];
        for (int i = 0; i < itemsToLoot.length; i++) {
            hero.getInventory().addItem(itemsToLoot[i]);
        }
    }

    @Override
    public void lootMoney(Hero hero) {
        Money moneyToLoot = money;
        money = Money.ZERO;
        hero.getWallet().addMoney(moneyToLoot);
    }

    public InventoryItem[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
