package chapters.chapter_10.Exercise_04;

public class MyPointTest {

    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
        System.out.println(point1.distance(0, 0));
        System.out.println(point1.distance(1, 1));
    }
}
