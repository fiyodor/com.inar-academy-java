package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_33 {

    public static void main(String[] args) {

        int year = getYear();

        showChineseZodiac(year);
    }

    public static void showChineseZodiac(int year) {

        String[] chineseZodiac= {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        System.out.println("Year " + year + " is " + chineseZodiac[year % 12] + " year");
    }

    public static int getYear() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");

        int year = input.nextInt();

        return year;
    }
}
