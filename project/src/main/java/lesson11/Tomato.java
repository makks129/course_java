package lesson11;

public class Tomato implements Edible {

    @Override
    public void printHowToCook() {
        System.out.println("Eat raw or bake");
    }

    @Override
    public void printHowToServe() {
        System.out.println("On the plate.");
    }

}
