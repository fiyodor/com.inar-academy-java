package chapters.chapter_12.Exercises.Exercise_25;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_25 {

    public static void main(String[] args) {

        ArrayList<String> list;

        double totalSalaryOfAssistants = 0;
        int numberOfAssistants = 0;

        double totalSalaryOfAssociates = 0;
        int numberOfAssociates = 0;

        double totalSalaryOfFulls = 0;
        int numberOfFulls = 0;

        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");

            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {

                String str = input.nextLine();
                list = new ArrayList<>(Arrays.asList(str.split(" ")));
                String rank = list.get(2);

                switch (rank){
                    case "assistant" : totalSalaryOfAssistants += Double.parseDouble(list.get(3));
                        numberOfAssistants++; break;
                    case "associate" : totalSalaryOfAssociates += Double.parseDouble(list.get(3));
                        numberOfAssociates++; break;
                    case "full"      : totalSalaryOfFulls +=  Double.parseDouble(list.get(3));
                        numberOfFulls++;
                }
                list.clear();
            }

        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
            System.exit(2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(3);
        }
        System.out.println("Total salary for assistant professors : "+ totalSalaryOfAssistants);
        System.out.println("Total salary for associate professors : "+ totalSalaryOfAssociates);
        System.out.println("Total salary for full professors : "+ totalSalaryOfFulls);
        System.out.println("Total salary for all faculty : " + (totalSalaryOfFulls + totalSalaryOfAssistants + totalSalaryOfAssociates));
        System.out.println("Average salary for assistant professors : "+ (totalSalaryOfAssistants / numberOfAssistants));
        System.out.println("Average salary for associate professors : "+ (totalSalaryOfAssociates / numberOfAssociates));
        System.out.println("Average salary for full professors : "+ (totalSalaryOfFulls / numberOfFulls));
        System.out.println("Average salary for all faculty : " + ((totalSalaryOfFulls + totalSalaryOfAssistants + totalSalaryOfAssociates) / (numberOfAssistants + numberOfAssociates + numberOfFulls)));
    }
}
