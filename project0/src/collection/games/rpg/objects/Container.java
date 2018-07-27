package collection.games.rpg.objects;

import collection.games.rpg.interfaces.InventoryItem;
import collection.games.rpg.interfaces.Lootable;
import collection.games.rpg.items.Item;
import collection.games.rpg.items.Money;

public abstract class Container extends GameWorldObject implements Lootable {

    private InventoryItem[] items;
    private Money money;

    public Container() {
        items = new Item[100]; // can contain max 100 items
        money = Money.ZERO;
    }

    @Override
    public InventoryItem[] lootItems() {
        InventoryItem[] itemsToLoot = items;
        items = null;
        return itemsToLoot;
    }

    @Override
    public Money lootMoney() {
        Money moneyToLoot = money;
        money = Money.ZERO;
        return moneyToLoot;
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
