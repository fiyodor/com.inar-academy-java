package chapters.chapter_09.Exercise_05;

import java.util.GregorianCalendar;

public class Exercise_05 {

    public static void main(String[] args) {

        GregorianCalendar date = new GregorianCalendar();

        System.out.println("Today is " + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (date.get(GregorianCalendar.MONTH) + 1) + "/" + date.get(GregorianCalendar.YEAR));

        date.setTimeInMillis(1234567898765L);

        System.out.println("Elapsed time is " + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (date.get(GregorianCalendar.MONTH) + 1) + "/" + date.get(GregorianCalendar.YEAR));
    }

}
