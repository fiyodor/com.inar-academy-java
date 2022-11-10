package chapters.chapter_10.Exercise_15;

import java.util.Scanner;

public class MyRectangle2DTest {

    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
        System.out.println(r1.contains(3, 3));
        System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

        final int NUMBER_OF_POINTS = 5;

        double[][] array = new double[NUMBER_OF_POINTS][2];

        System.out.print("Enter five points: ");

        fillArrayWithInputs(array);

        MyRectangle2D r = getRectangle(array);

        System.out.println("The rectangle in which all the points are enclosed");
        System.out.printf("Centre: (%4.2f, %4.2f)\n", r.getX(), r.getY());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
    }
    private static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {

            array[i][0] = input.nextDouble();
            array[i][1] = input.nextDouble();
        }
    }

    public static MyRectangle2D getRectangle(double[][] points){

        double lowestX = points[0][0];
        double lowestY = points[0][1];
        double highestX = points[0][0];
        double highestY = points[0][1];

        for(int i = 0; i < points.length; i++) {

            if(points[i][0] < lowestX){

                lowestX = points[i][0];
            }
            if(points[i][1] < lowestY){

                lowestY = points[i][1];
            }
            if(points[i][0] > highestX){

                highestX = points[i][0];
            }
            if(points[i][1] > highestY){

                highestY = points[i][1];
            }
        }

        double width = highestX - lowestX;
        double height = highestY - lowestY;
        double x = lowestX + (width / 2);
        double y = lowestY + (height / 2);

        MyRectangle2D r = new MyRectangle2D(x, y, width, height);

        return r;
    }
}