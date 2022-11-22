package chapters.chapter_12.Listings;

import java.io.*;

public class Listing_12_13_WriteData {

    public static void main(String[] args) throws IOException {

        File file = new java.io.File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        // Close the file
        output.close();
    }
}
