public class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void displayTimeInfo() {
        System.out.println("time:");
        System.out.print(hour + ":");
        System.out.print(minute + ":");
        System.out.print(second);
    }
}
