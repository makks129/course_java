package collection.games.rpg.interfaces;

import collection.games.rpg.creatures.heros.Hero;

public interface Lootable {

    void lootItems(Hero toHero);

    void lootMoney(Hero toHero);

}
