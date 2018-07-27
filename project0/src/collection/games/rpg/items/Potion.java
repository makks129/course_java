package collection.games.rpg.items;

import collection.games.rpg.creatures.heros.Hero;

public abstract class Potion extends Item {

    public Potion(String name) {
        super(name);
    }

    protected abstract void affect(Hero hero);

    @Override
    public String[] useActions() {
        return new String[]{"Drink"};
    }

}
