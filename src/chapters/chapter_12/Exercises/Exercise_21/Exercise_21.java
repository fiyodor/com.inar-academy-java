package chapters.chapter_12.Exercises.Exercise_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_21 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\90543\\workspace\\com.inar-academy-java\\src\\chapters\\chapter_12\\Exercises\\Exercise_21\\SortedStrings.txt");

        String strToBeCompared1;
        String strToBeCompared2 = null;

        try (Scanner input = new Scanner(file)){

            while (input.hasNext()){

                strToBeCompared1 = input.next();

                if(strToBeCompared2 != null){

                    if(strToBeCompared2.compareToIgnoreCase(strToBeCompared1) > 0){
                        System.out.println("The file is not sorted");

                        System.out.println(strToBeCompared2 + " " + strToBeCompared1);
                        System.exit(0);
                    }
                }
                strToBeCompared2 = strToBeCompared1;
            }
            System.out.println("The file is sorted");
        }
    }
}
