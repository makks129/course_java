package collection.games.rpg.items;

import collection.games.rpg.interfaces.InventoryItem;

public class Inventory {

    private InventoryItem[] items;
    private int itemsCount;

    public Inventory() {
    }

    public InventoryItem[] getItems() {
        return items;
    }

    public void addItem(InventoryItem item) {
        items[itemsCount++] = item;
    }
}
