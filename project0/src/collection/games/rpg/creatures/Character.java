package collection.games.rpg.creatures;

import collection.games.rpg.creatures.races.Race;

public abstract class Character extends Creature {

    private Race race;

    protected Character(Race race, String name, int strength, int intelligence, int agility) {
        super(name, strength, intelligence, agility);
        this.race = race;
        getHealth().increaseMaxHealthByCoefficient(race.getHealthCoefficient());
    }

    public Race getRace() {
        return race;
    }

}
