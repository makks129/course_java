package lesson13.observer_pattern;

public class Screen {

    private Button button;

    public Screen(Button button) {
        this.button = button;

        button.setListener(new Button.Listener() {
            @Override
            public void onClick() {
                java.lang.System.out.println("Button was clicked!");
            }
        });

    }

}
