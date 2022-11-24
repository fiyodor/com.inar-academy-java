package chapters.chapter_06.Exercises;

public class Exercise_16 {

    public static void main(String[] args) {

        System.out.println("Year          Days");
        System.out.println("------------------");

        int sumDays = 0;

        for (int i = 2000; i <= 2020 ; i++) {
            sumDays += numberOfDaysInAYear(i);
            System.out.println(i + "          " + numberOfDaysInAYear(i));
        }
        System.out.println("-------------------");
        System.out.println("Total Day     " + sumDays);
    }

    public static int numberOfDaysInAYear(int year){

        return isLeapYear(year) ? 366 : 365;

    }
    public static boolean isLeapYear( int year){

        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}
