package chapters.chapter_12.Exercises.Exercise_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_11 {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length != 2) {

            System.out.println("Two arguments: a String and a (File name)");
            System.exit(0);
        }
        File file = new File(args[1]);

        if(! file.exists()) {

            System.out.println("No such file");
            System.exit(1);
        }
        String str = "";

        StringBuilder strRemoved = new StringBuilder();

        int counter = 0;

        try (Scanner input = new Scanner(file)){

            while (input.hasNext()){

                str = input.nextLine();

                strRemoved.append(str.replaceAll(args[0], "") + '\n');

                counter++;
            }
        }

        try (PrintWriter output = new PrintWriter(file)){

            output.print(strRemoved);
        }

    }
}