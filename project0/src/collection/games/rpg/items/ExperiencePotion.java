package collection.games.rpg.items;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.Consumable;

public class ExperiencePotion extends Potion implements Consumable {

    private int xpAmount;

    public ExperiencePotion(String name, int xpAmount) {
        super(name);
        this.xpAmount = xpAmount;
    }

    @Override
    protected void affect(Hero hero) {
        hero.getExperience().gainExperience(xpAmount);
    }

    @Override
    public String consume(Hero hero) {
        affect(hero);
        return "Hero " + hero.getName() + " has used the potion " + name;
    }

}
