package lesson5.homework;

public class Date0 {

    public long milliseconds;

    public Date0(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getYear() {
        return (int) (milliseconds / 3600000 * 24 * 30 * 12);
    }

    public int getMonth() {
        return (int) (milliseconds / 3600000 * 24 * 30) % 12;
    }

    public int getDay() {
        return (int) (milliseconds / 3600000 * 24) % 30;
    }

    public int getHour() {
        return (int) (milliseconds / 3600000) % 24;
    }

    public int getMinute() {
        return (int) (milliseconds / 60000) % 60;
    }

    public int getSecond() {
        return (int) (milliseconds / 1000) % 60;
    }

}
