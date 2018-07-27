package collection.games.rpg.items;

import collection.games.rpg.interfaces.InventoryItem;

import java.util.UUID;

public abstract class Item implements InventoryItem {

    protected UUID id;
    protected String name;

    public Item(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean canPutIntoInventory() {
        return true;
    }

}
