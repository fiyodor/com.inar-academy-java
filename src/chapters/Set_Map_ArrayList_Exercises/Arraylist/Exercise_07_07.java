package chapters.Set_Map_ArrayList_Exercises.Arraylist;

import java.util.ArrayList;

public class Exercise_07_07 {

    public static void main(String[] args) {

        ArrayList<Integer> counts = new ArrayList<>();
        fillArrayList(counts);

        for (int i = 0; i < 100; i++) {

            int x = (int) (Math.random() * 10);
            System.out.print(x + " , ");
            counts.set(x, counts.get(x) + 1);
        }
        System.out.println();
        displayOccurrences(counts);
    }

    private static void fillArrayList(ArrayList<Integer> counts) {
        for (int i = 0; i < 10; i++) {
            counts.add(0);
        }
    }

    public static void displayOccurrences(ArrayList<Integer> counts) {
        for (int i = 0; i < counts.size(); i++) {
            System.out.println((i) + " occurs " + counts.get(i) + " times");
        }
    }
}
