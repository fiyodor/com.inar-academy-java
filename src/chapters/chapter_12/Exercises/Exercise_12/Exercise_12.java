package chapters.chapter_12.Exercises.Exercise_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_12 {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length != 1){

            System.out.println("One argument: a File name)");

            System.exit(0);
        }
        File file = new File(args[0]);

        if(!file.exists()){

            System.out.println("No such file");
            System.exit(1);
        }

       String str = "";

        try (Scanner input = new Scanner(file)){

            while (input.hasNext()){

                //str += input.nextLine();  alt satıra geçmiyor
                str += input.nextLine() + "\n";
            }
            str = str.replaceAll("\\s*\\{", " {");
        }
        try(PrintWriter output = new PrintWriter(file)) {

            output.print(str);
        }
    }
}
