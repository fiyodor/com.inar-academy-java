package chapters.chapter_12.Exercises.Exercise_23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_23 {

    public static void main(String[] args) {

        int counterOfNumbers = 0;
        double sum = 0;

        try {
            URL url = new URL("http://cs.armstrong.edu//liang//data//Scores.txt");
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                sum += input.nextDouble();
                counterOfNumbers++;
            }
        }
       catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(2);
        }
        System.out.println("The sum of all the elements is " + sum);
        System.out.println("The average is " + sum / counterOfNumbers);
    }
}
