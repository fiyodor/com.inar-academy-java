package chapters.chapter_12.Exercises.Exercise_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_14 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter path of the file: ");

        String path = input.nextLine();

        File file  = new File(path);

        if(!file.exists()){

            System.out.println("No such file");
            System.exit(1);
        }

        double sum = 0;
        int counterOfNumbers = 0;

        try (Scanner input2 = new Scanner(file)){

            while (input2.hasNext()){

                sum += input2.nextDouble();

                counterOfNumbers++;
            }
        }
        System.out.println("The sum of all the elements is " + sum);
        System.out.println("The average is " + sum / counterOfNumbers);


    }
}
