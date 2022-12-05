package chapters.chapter_12.Exercises.Exercise_32;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_32 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Year    Rank 1      Rank 2      Rank 3      Rank 4      Rank 5      Rank 1      Rank 2      Rank 3      Rank 4      Rank 5");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        for (int i = 2010; i >= 2001 ; i--) {

            showResults(i);
        }
    }

    private static void showResults(int year) {
        String[] girlsNames = new String[5];
        String[] boysNames = new String[5];
        try {
            URL url = new URL("http://liveexample.pearsoncmg.com/data/babynameranking"+ year + ".txt");

            Scanner input = new Scanner(url.openStream());

            int girlsIndex = 0;
            int boysIndex = 0;
            int counter = 0;

            while (input.hasNext() && counter < 5) {
                String str = input.nextLine();
                String[] strArray = str.split("\\s+");
                girlsNames[girlsIndex]= strArray[3];
                boysNames[boysIndex] = strArray[1];
                girlsIndex++;
                boysIndex++;
                counter++;
            }
            System.out.printf("%-8d%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s" , year , girlsNames[0] , girlsNames[1], girlsNames[2] ,girlsNames[3] , girlsNames[4],boysNames[0] , boysNames[1], boysNames[2] ,boysNames[3] , boysNames[4]);
            System.out.println();

        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
            System.exit(2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(3);
        }
    }
}
