package lesson13.inner_classes;

public class OuterClass {

    private int data;
    private InnerClass innerClass;

    public OuterClass() {
        innerClass = new InnerClass();
    }

    private void outerClassMethod() {
        data++;
    }


    public class InnerClass {

        public InnerClass() {
        }

        private void innerClassMethod() {
            data++;
            outerClassMethod();
        }

    }


    public interface InnerInterface {
        void method();
    }


}