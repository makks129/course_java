package lesson11.edibles;

public class Chicken implements Edible {

    @Override
    public void printHowToCook() {
        System.out.println("Boil or fry");
    }

    @Override
    public void printHowToServe() {
        System.out.println("On the plate");
    }
}
