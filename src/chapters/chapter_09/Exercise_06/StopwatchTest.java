package chapters.chapter_09.Exercise_06;

import chapters.chapter_07.Exercises.Exercise_12;
import chapters.chapter_07.Exercises.Exercise_14;

public class StopwatchTest {

    public static void main(String[] args) {

        int[] array = new int[100_000];

        fillArrayRandomly(array);

        Stopwatch durationOfSorting = new Stopwatch();

        durationOfSorting.start();

        Exercise_14.selectionSort(array);

        durationOfSorting.stop();

        Exercise_12.displayArray(array);

        System.out.println("\nSelection sort took " + durationOfSorting.getElapsedTime() + " in milliseconds");

    }
    public static void fillArrayRandomly(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int)(Math.random() * 1000);
        }
    }
}
