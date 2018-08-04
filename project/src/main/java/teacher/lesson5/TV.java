package teacher.lesson5;

public class TV {

    String brand;
    double diagonal;
    boolean on;
    int channel;
    int volume;


    public TV(String brand, double diagonal) {
        this.brand = brand;
        this.diagonal = diagonal;
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    void switchOnOff() {
        on = !on;
    }

    boolean isOn() {
        return on;
    }

    void setChannel(int newChannel) {
        if (on) {
            channel = newChannel;
        }
    }

    void channelUp() {
        if (on) {
            channel++;
        }
    }

    void channelDown() {
        if (on) {
            channel--;
        }
    }

    void volumeUp() {
        if (on) {
            volume++;
        }
    }

    void volumeDown() {
        if (on) {
            volume--;
        }
    }
}
