package collection.games.rpg.creatures.mosters;

public class SimpleBoss extends Boss {

    public SimpleBoss(String name, int strength, int intelligence, int agility) {
        super(name, strength, intelligence, agility);
    }

    @Override
    public int attack() {
        return 100;
    }
}
