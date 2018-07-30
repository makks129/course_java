package lesson13.observer_pattern;

public class Button {

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /**
     * System will call this method when user clicks on button
     */
    public void userClicked() {
        listener.onClick();
    }

    public interface Listener {
        void onClick();
    }

}
