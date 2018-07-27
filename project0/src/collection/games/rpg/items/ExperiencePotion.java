package collection.games.rpg.items;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.Consumable;

public class ExperiencePotion extends Potion {

    private int xpAmount;

    public ExperiencePotion(String name, int xpAmount) {
        super(name);
        this.xpAmount = xpAmount;
    }

    @Override
    protected void affect(Hero hero) {
        hero.getExperience().gainExperience(xpAmount);
    }

}
