package collection.games.rpg.creatures.races;

public class Elf extends Race  {

    @Override
    public void sayHello() {
        System.out.println("Eldurian ta!");
    }

    @Override
    public double getHealthCoefficient() {
        return 0.9;
    }
}
