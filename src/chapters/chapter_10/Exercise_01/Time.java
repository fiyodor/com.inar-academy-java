package chapters.chapter_10.Exercise_01;

public class Time {

    private long hour;
    private long minute;
    private long second;

    public Time(){

        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970

        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour

        this.second = totalSeconds % 60;

        // Obtain the total minutes

        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour

        this.minute = totalMinutes % 60;

        // Obtain the total hours

        long totalHours = totalMinutes / 60;

        // Compute the current hour

        this.hour = totalHours % 24;
    }
    public Time(long elapsedTime){

        long totalMilliseconds = elapsedTime;

        // Obtain the total seconds since midnight, Jan 1, 1970

        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour

        this.second = totalSeconds % 60;

        // Obtain the total minutes

        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour

        this.minute = totalMinutes % 60;

        // Obtain the total hours

        long totalHours = totalMinutes / 60;

        // Compute the current hour

        this.hour = totalHours % 24;
    }

    public Time(long hour, long minute, long second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime){

        long totalMilliseconds = elapsedTime;

        // Obtain the total seconds since midnight, Jan 1, 1970

        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour

        second = totalSeconds % 60;

        // Obtain the total minutes

        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour

        minute = totalMinutes % 60;

        // Obtain the total hours

        long totalHours = totalMinutes / 60;

        // Compute the current hour

        hour = totalHours % 24;

    }
}
