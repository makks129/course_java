package lesson10.test_errors;

public class TestErrorsClassA {

    public TestErrorsClassA() {
        method();
    }

    public void method() {
        System.out.println(1 / 0);
    }

}
