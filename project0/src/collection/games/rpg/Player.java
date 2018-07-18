package collection.games.rpg;

import collection.games.rpg.heros.Hero;

public class Player {

    private Hero hero;

    public Player(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

}
