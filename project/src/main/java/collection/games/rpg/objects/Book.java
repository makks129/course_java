package collection.games.rpg.objects;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.Consumable;
import collection.games.rpg.interfaces.InventoryItem;
import collection.games.rpg.interfaces.Targetable;

public class Book extends Container implements Targetable, Consumable, InventoryItem {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String[] actionsOnTarget() {
        return new String[]{"Put into inventory"};
    }

    @Override
    public String consume(Hero hero) {
        hero.getExperience().gainExperience(10);
        return "Hero " + hero.getName() + " has read the book " + name + " and gained 10 experience";
    }

    @Override
    public boolean canPutIntoInventory() {
        return true;
    }

    @Override
    public String[] useActions() {
        return new String[] {"Read", "Loot"};
    }

}
