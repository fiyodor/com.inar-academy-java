package chapters.chapter_13.Exercises.Exercise_05;

public class Test {

    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(2);
        GeometricObject circle2 = new Circle(3);

        GeometricObject rectangle1 = new Rectangle(5,5);
        GeometricObject rectangle2 = new Rectangle(3 , 3);

        System.out.println("Max of two circles : " + GeometricObject.max(circle1,circle2));
        System.out.println("Max of two rectangles : " + GeometricObject.max(rectangle1,rectangle2));
    }
}
