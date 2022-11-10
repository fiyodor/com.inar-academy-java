package chapters.chapter_10.Exercise_13;

public class MyRectangle2DTest {

    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 6, 8);

        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
        System.out.println(r1.contains(3, 3));
        System.out.println(r1.contains(new MyRectangle2D(4, 1, 6, 4)));
        System.out.println(r1.overlaps(new MyRectangle2D(4, 1, 6 ,4)));
    }
}
