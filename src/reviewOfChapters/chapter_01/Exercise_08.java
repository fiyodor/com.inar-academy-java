package reviewOfChapters.chapter_01;

public class Exercise_08 {

    public static void main(String[] args) {

        double radius = 5.5;
        double pi = 4 * (( 1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
        double perimeter = 2 * 5.5 * pi;
        double area = radius * radius * pi;

        System.out.println("Area of the circle that has a radius of " + radius + " :" + area);
        System.out.println("Perimeter of the circle that has a radius of " + radius + " :" + perimeter);
    }
}
