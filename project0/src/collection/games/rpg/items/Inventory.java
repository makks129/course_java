package collection.games.rpg.items;

import collection.games.rpg.interfaces.InventoryItem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<InventoryItem> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public void setItems(List<InventoryItem> items) {
        this.items = items;
    }
}
