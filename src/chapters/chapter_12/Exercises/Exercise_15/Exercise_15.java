package chapters.chapter_12.Exercises.Exercise_15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) throws IOException {

        File file = createAFile();

        try (PrintWriter output = new PrintWriter(file)){

            for(int i = 0; i < 100; i++) {

                output.print(produceRandomNumbers() + " ");
            }
        }
        int[] array = createArrayFromFile(file);

        sort(array);

        displayArray(array);

    }
    public static File createAFile(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the path for a new file: ");

        String path = input.nextLine();

        File file = new File(path);

        if(file.exists()){

            System.out.println("This file have already been created");

            System.exit(0);
        }

        return file;
    }
    public static int produceRandomNumbers(){

       return (int) (Math.random() * 100);
    }

    public static int[] createArrayFromFile(File file) throws IOException {

        int[] array = new int[100];

        Scanner input = new Scanner(file);

        for(int i = 0; i < 100; i++) {

            array[i] = input.nextInt();
        }
        return array;
    }

    public static void sort(int[] array){

        int temp;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]){

                    temp = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void displayArray(int[] array){

        int counter = 0;

        for(int j : array) {

            System.out.printf("%-3d", j);

            counter++;

            if(counter % 10 == 0) {

                System.out.println();
            }
        }
    }
}
