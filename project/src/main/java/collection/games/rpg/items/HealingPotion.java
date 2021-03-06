package collection.games.rpg.items;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.Consumable;

public class HealingPotion extends Potion {

    private int healAmount;

    public HealingPotion(String name, int healAmount) {
        super(name);
        this.healAmount = healAmount;
    }

    @Override
    protected void affect(Hero hero) {
        hero.getHealth().getHealed(healAmount);
    }

}
