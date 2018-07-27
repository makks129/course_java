package collection.games.rpg.objects;

import collection.games.rpg.creatures.heros.Hero;
import collection.games.rpg.interfaces.Consumable;

public class HealingFountain extends GameWorldObject implements Consumable {

    @Override
    public String consume(Hero hero) {
        hero.getHealth().getHealed(1000);
        return "Hero " + hero.getName() + " was healed for 1000 hp";
    }

}
