package WatchActivity;

public class Watch {
    private int hour;
    private int minute;
    private int second;

    // ✅ Constructors must match the class name exactly
    public Watch() {}

    public Watch(int hour) {
        this.hour = hour;
    }

    public Watch(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Watch(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Display method
    public void display() {
        System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
    }
}
