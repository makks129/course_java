package lesson10;

public class TestCatchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println("Before the method call");
            method();
            System.out.println("After the method call");
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void method() {
//        int x = 1 / 0;
//        throw new RuntimeException("");
//        throw new Exception("");
    }

}
