package chapters.chapter_12.Exercises.Exercise_16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {

    public static void main(String[] args) throws IOException {

        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText File oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<String> list = new ArrayList<>();
        
        try (Scanner input = new Scanner(sourceFile)){

            while (input.hasNext()) {
             String   str = input.nextLine();
             list.add(str.replaceAll(args[1], args[2]));
            }

        }
       try ( PrintWriter output = new PrintWriter(sourceFile)){
            for(int i = 0; i < list.size(); i++) {
                output.print(list.get(i));

            }
        }
    }
}
