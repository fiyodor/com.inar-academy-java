package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");

        int numOfCities = input.nextInt();

        double[][] coordinatesOfCities = new double[numOfCities][2];

        System.out.println("Enter the coordinates of the cities:");

        fillArrayWithInputs(coordinatesOfCities);

        double minDistance = Double.MAX_VALUE;

        double index1 = 0;

        double index2 = 0;

        for (int i = 0; i < coordinatesOfCities.length; i++) {

            double distance = getDistance(coordinatesOfCities, coordinatesOfCities[i][0], coordinatesOfCities[0][1]);

            if (distance < minDistance){

                index1 = coordinatesOfCities[i][0];

                index2 = coordinatesOfCities[i][1];

                minDistance = distance;
            }
        }
        System.out.printf("The central city is at (%3.1f, %3.1f)", index1, index2);

        System.out.printf("\nThe total distance to all other cities is %5.2f", minDistance);


    }
    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }
    public static double getDistance(double[][] array, double p1, double p2){

        double distance = 0;

        for (int i = 0; i < array.length; i++) {

            distance += Math.sqrt(Math.pow(array[i][0]-p1,2)+Math.pow(array[i][1]-p2,2));
        }
        return distance;
    }
}