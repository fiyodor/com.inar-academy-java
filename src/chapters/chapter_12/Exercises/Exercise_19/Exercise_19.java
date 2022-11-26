package chapters.chapter_12.Exercises.Exercise_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_19 {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://github.com/fiyodor/com.inar-academy-java/blob/master/scores.txt");

            int counterOfWords = 0;

            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()){

                char ch = input.next().charAt(0);

                if(Character.isLetter(ch)){
                    counterOfWords++;
                }
            }
            System.out.println("Number of words is " + counterOfWords);
        }catch (MalformedURLException malformedURLException){

            System.out.println("No such URL");

        }catch (IOException ioException){

            System.out.println("No such file");
        }
    }
}
