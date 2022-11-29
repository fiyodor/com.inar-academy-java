package chapters.chapter_12.Exercises.Exercise_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_22 {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length != 3) {
            System.out.println("Usage: java ReplaceText directory oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File directory = new File(args[0]);
        if(!directory.isDirectory()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(2);
        }
        ArrayList<File> directories = new ArrayList<>(Arrays.asList(directory.listFiles()));

        while (! directories.isEmpty()) {
           if(directories.get(0).isDirectory()){
               directories.addAll(Arrays.asList(directories.get(0).listFiles()));
           }
           else {
               ArrayList<String> str = new ArrayList<>();
               try (Scanner input = new Scanner(directories.get(0))) {
                   while (input.hasNext()) {
                       str.add((input.nextLine()).replaceAll(args[1],args[2]));
                   }
               }
               try (PrintWriter output = new PrintWriter(directories.get(0))) {
                   for (int i = 0; i < str.size(); i++) {
                       output.println(str.get(i));
                   }
               }
               directories.remove(0);
           }

        }
    }
}
