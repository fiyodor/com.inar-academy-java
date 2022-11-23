package chapters.chapter_07.Exercises;

public class Exercise_07 {

    public static void main(String[] args) {

     int[] counts = new int[10];

        fillArrayRandomly(counts);

        displayCounts(counts);

    }

    public static void displayCounts(int[] counts) {

        System.out.println("Count for each number between 0 and 9:");

        for (int i = 0; i < counts.length; i++) {

            System.out.println(i + "s: " + counts[i] + " time" + (counts[i] == 1 ? "" : "s"));
        }
    }

    public static void fillArrayRandomly(int[] numbersBetween0To10) {
        for (int i = 0; i < 100; i++) {

            numbersBetween0To10[(int)(Math.random() * 10)]++;
        }
    }
}
