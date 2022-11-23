package chapters.chapter_10.Exercises.Exercise_14;

import java.util.GregorianCalendar;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(){

        GregorianCalendar gc = new GregorianCalendar();

        this.year = gc.get(GregorianCalendar.YEAR);
        this.month = gc.get(GregorianCalendar.MONTH);
        this.day = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapsedTime){

        setDate(elapsedTime);


    }

    public MyDate(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime){

        GregorianCalendar gc = new GregorianCalendar();

        gc.setTimeInMillis(elapsedTime);

        year = gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH);
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public String toString(){

        return getDay() + "." + getMonth() + "." + getYear();
    }
}
