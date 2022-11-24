package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter milliseconds: ");

        long milliseconds = input.nextLong();

        System.out.println(convertMillis(milliseconds));


    }
    public static String convertMillis(long millis){

        long totalSeconds = millis / 1000;

        long second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long hour = totalHours % 24;

        String time = hour + " : " + minute + " : " + second;

        return time;
    }
}
