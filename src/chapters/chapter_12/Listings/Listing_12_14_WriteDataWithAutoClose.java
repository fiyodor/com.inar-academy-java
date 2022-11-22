package chapters.chapter_12.Listings;

import java.io.*;

public class Listing_12_14_WriteDataWithAutoClose {

    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (PrintWriter output = new java.io.PrintWriter(file)) {   // Create a file with Printer class

            // Write formatted output to the file
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}

