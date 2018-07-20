package collection.games.rpg.creatures.mosters;

public class Boss extends Monster {

    public Boss(String name, int strength, int intelligence, int agility) {
        super(name, strength, intelligence, agility);
        health = 10000;
    }

    @Override
    public int attack() {
        return 500;
    }

}
