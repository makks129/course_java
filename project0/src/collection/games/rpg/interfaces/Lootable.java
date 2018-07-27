package collection.games.rpg.interfaces;

import collection.games.rpg.items.Money;

public interface Lootable {

    InventoryItem[] lootItems();

    Money lootMoney();

}
