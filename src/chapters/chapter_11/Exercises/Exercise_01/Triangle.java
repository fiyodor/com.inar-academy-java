package chapters.chapter_11.Exercises.Exercise_01;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(){

        this(1.0, 1.0, 1.0);
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {

        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public double getPerimeter(){

        return side1 + side2 + side3;
    }

    @Override
    public String toString(){

        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 + " " + super.toString();
    }
}
