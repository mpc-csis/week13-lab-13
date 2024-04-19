import java.text.DecimalFormat;

/**
 * @author
 * @version
 */
public class Time implements Comparable<Time> {

    private int hour;
    private int minute;
    private double second;
    private static final DecimalFormat df = new DecimalFormat("00.##");

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, double second) {
        this(toSeconds(hour, minute, second));
    }

    public Time(double seconds) {
        fromSeconds(seconds);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        fromSeconds(toSeconds(hour, this.minute, this.second));
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        fromSeconds(toSeconds(this.hour, minute, this.second));
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        fromSeconds(toSeconds(this.hour, this.minute, second));
    }

    private void fromSeconds(double seconds) {
        this.hour = (int) (seconds / 3600D);
        seconds -= this.hour * 3600D;
        this.minute = (int) (seconds / 60D);
        seconds -= this.minute * 60D;
        this.second = seconds;
    }

    public static double toSeconds(int hour, int minute, double second) {
        return ((hour * 60) + minute) * 60 + second;
    }

    public double toSeconds() {
        return toSeconds(hour, minute, second);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%s", hour, minute, df.format(second));
    }

    @Override
    public int compareTo(Time that) {
        double diff = that.toSeconds() - this.toSeconds();
        if (diff < 0)
            return -1;
        else if (diff > 0)
            return 1;
        else
            return 0;
    }

    public Time add(Time t) {
        return new Time(hour + t.getHour(),
                minute + t.getMinute(),
                second + t.getSecond());
    }

    public static void printTime(Time t) {
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        System.out.println("new Time(1, 2, 3.0001) -> " + new Time(1, 2, 3.0001));
        System.out.println("new Time(0, 0, 61)     -> " + new Time(0, 0, 61));
        System.out.println("new Time(0, 80, 0)     -> " + new Time(0, 80, 0));
        Time a = new Time(1, 1, 0);
        Time b = new Time(0, 0, 30);
        System.out.println("(new Time(1, 1, 0)).add(new Time(0, 0, 30)) -> " + a.add(b));
        System.out.println("a.compareTo(b) -> " + a.compareTo(b));
        System.out.println("b.compareTo(a) -> " + b.compareTo(a));
        System.out.println("a.compareTo(a) -> " + a.compareTo(a));
    }
}