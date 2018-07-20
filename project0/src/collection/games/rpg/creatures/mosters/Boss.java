package collection.games.rpg.creatures.mosters;

public class Boss extends Monster {

    public Boss(String name, int health, int strength, int intelligence, int agility) {
        super(name, health, strength, intelligence, agility);
    }

    @Override
    public int attack() {
        return 500;
    }

}
