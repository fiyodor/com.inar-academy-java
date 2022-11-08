package chapters.chapter_10.Exercise_01;

public class TimeTest {
    public static void main(String[] args) {

        Time time1 = new Time();

        Time time2 = new Time(555550000);

        System.out.println("Time 1: " + (time1.getHour() < 10 ? "0" : "") + time1.getHour() + "." + (time1.getMinute() < 10 ? "0" : "") + time1.getMinute() + "." + (time1.getSecond() < 10 ? "0" : "") + time1.getSecond());

        System.out.println("Time 2: " + (time2.getHour() < 10 ? "0" : "") + time2.getHour() + "." + (time2.getMinute() < 10 ? "0" : "") + time2.getMinute() + "." + (time2.getSecond() < 10 ? "0" : "") + time2.getSecond());

    }
}
