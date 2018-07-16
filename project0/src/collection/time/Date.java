package collection.time;

public class Date {

    public long milliseconds;

    public Date(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getYear() {
        return getMonths() / 12;
    }

    public int getMonth() {
        return getMonths() % 12;
    }

    public int getDay() {
        return getDays() % 30;
    }

    public int getHour() {
        return getHours() % 24;
    }

    public int getMinute() {
        return getMinutes() % 60;
    }

    public int getSecond() {
        return getSeconds() % 60;
    }

    public int getSeconds() {
        return (int) (milliseconds / 1000);
    }

    public int getMinutes() {
        return getSeconds() / 60;
    }

    public int getHours() {
        return getMinutes() / 60;
    }

    public int getDays() {
        return getHours() / 24;
    }

    public int getMonths() {
        return getDays() / 30;
    }

}
