package chapters.chapter_12.Exercises.Exercise_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_13 {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length != 1){

            System.out.println("One argument (File name)");
            System.exit(0);
        }
        File file  = new File(args[0]);

        if(!file.exists()){

            System.out.println("No such file");
            System.exit(1);
        }
        String str = "";
        int wordCounter = 0;
        int lineCounter = 0;
        int charCounter = 0;

        try (Scanner input = new Scanner(file)){

            while (input.hasNext()){

                str = input.nextLine();
                lineCounter++;
                charCounter += countChars(str);
                wordCounter += countWords(str);
            }
        }
        System.out.println("Number of lines: " + lineCounter);
        System.out.println("Number of characters: " + charCounter);
        System.out.println("Number of words: " + wordCounter);
    }

    public static int countChars(String str){

        int counter = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) != ' ');

            counter++;
        }
        return counter;
    }

    public static int countWords(String str){

        String[] array = str.split(" ");

        return array.length;
    }
}
