package collection.games.rpg.items;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.Consumable;

public abstract class Potion extends Item implements Consumable {

    public Potion(String name) {
        super(name);
    }

    protected abstract void affect(Hero hero);

    @Override
    public String[] useActions() {
        return new String[]{"Drink"};
    }

    @Override
    public String consume(Hero hero) {
        affect(hero);
        return "Hero " + hero.getName() + " has used the potion " + name;
    }

}
