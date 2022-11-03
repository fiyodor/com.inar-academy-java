package chapters.chapter_09.Exercise_09;

public class RegularPolygonTest {

    public static void main(String[] args) {

        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(4, 6);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Regular polygon     Perimeter     Area");
        System.out.println("-----------------------------------------");
        System.out.printf("%8s              %4.1f        %f\n", "p1", p1.getPerimeter(), p1.getArea());
        System.out.printf("%8s              %4.1f        %f\n", "p2", p2.getPerimeter(), p2.getArea());
        System.out.printf("%8s              %4.1f        %f\n", "p3", p3.getPerimeter(), p3.getArea());
    }
}
