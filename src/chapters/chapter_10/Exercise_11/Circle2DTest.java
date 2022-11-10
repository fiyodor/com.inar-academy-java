package chapters.chapter_10.Exercise_11;

public class Circle2DTest {

    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println( "Circle2D c1's area: " + c1.getArea());
        System.out.println( "Circle2D c1's perimeter: " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}
