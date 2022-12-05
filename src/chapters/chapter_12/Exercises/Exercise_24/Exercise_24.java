package chapters.chapter_12.Exercises.Exercise_24;

import java.io.File;
import java.io.PrintWriter;

public class Exercise_24 {

    public static void main(String[] args) throws Exception {
        File file = new File("Salary.txt");

        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(1);
        }

        StringBuilder stringBuilder = new StringBuilder();

        String[] ranks = {"Assistant", "Associate", "Full"};
        int rank;

        try (PrintWriter output = new PrintWriter(file)) {

            for (int i = 1; i <= 1000; i++) {

                rank = (int) (Math.random() * ranks.length);
                stringBuilder = stringBuilder.replace(0, stringBuilder.length(), ranks[rank]);
                double salary = getSalary(rank);
                output.printf("FirstName%-4d LastName%-4d %-9s   %6.2f\n", i, i, stringBuilder, salary);
            }
        }
    }

    private static double getSalary(int rank) {
        if (rank == 1){
            return (Math.random() * 30_000) + 50_000;
        } else if (rank == 2) {
            return (Math.random() * 50_000) + 60_000;
        }else
            return (Math.random() * 55_000) + 75_000;

    }
}
