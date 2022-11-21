package chapters.chapter_11.Listings;

public class Listing_11_04_TestCircleRectangle {

    public static void main(String[] args) {
        Listing_11_02_CircleFromSimpleGeometricObject circle = new Listing_11_02_CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        Listing_11_03_RectangleFromSimpleGeometricObject rectangle = new Listing_11_03_RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}
