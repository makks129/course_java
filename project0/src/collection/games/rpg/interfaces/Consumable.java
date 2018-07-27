package collection.games.rpg.interfaces;

import collection.games.rpg.creatures.heros.Hero;

public interface Consumable {

    /**
     * Consume action
     *
     * @param hero the consumer
     * @return consuming result text to print
     */
    String consume(Hero hero);

}
