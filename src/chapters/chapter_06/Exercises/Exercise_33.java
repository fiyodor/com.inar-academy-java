package chapters.chapter_06.Exercises;

public class Exercise_33 {

    public static void main(String[] args) {

        long milliseconds =System.currentTimeMillis();

        String date = Exercise_24.getDate(milliseconds);

        System.out.println("Current date and time is " + date + " --> " + Exercise_24.getCurrentTime(milliseconds));
    }
}
