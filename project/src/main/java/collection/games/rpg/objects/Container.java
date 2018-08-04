package collection.games.rpg.objects;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.InventoryItem;
import collection.games.rpg.interfaces.Lootable;
import collection.games.rpg.items.Inventory;
import collection.games.rpg.items.Item;
import collection.games.rpg.items.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends GameWorldObject implements Lootable {

    private List<InventoryItem> items;
    private Money money;

    public Container() {
        items = new ArrayList<>();
        money = Money.ZERO;
    }

    @Override
    public void lootItems(Hero toHero) {
        toHero.getInventory().getItems().addAll(items);
        items.clear();
    }

    @Override
    public void lootMoney(Hero toHero) {
        toHero.getWallet().addMoney(money);
        money = Money.ZERO;
    }

    public List<InventoryItem> getItems() {
        return items;
    }

    public void setItems(List<InventoryItem> items) {
        this.items = items;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
}
