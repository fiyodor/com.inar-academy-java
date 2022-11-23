package chapters.chapter_10.Exercises.Exercise_11;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D(){

        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){

        return Math.pow(getRadius(), 2) * Math.PI;
    }

    public double getPerimeter() {

        return 2. * getRadius() * Math.PI;
    }

    public boolean contains(Circle2D circle){

        double radius1 = getRadius();

        double radius2 = circle.getRadius();

        return getDistance(circle) <= radius1 - radius2;
    }

    public double getDistance(Circle2D circle){

        return Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));
    }

    public boolean contains(double x, double y){

        Circle2D circle2D = new Circle2D(x, y, 0);

        return contains(circle2D);
    }

    public boolean overlaps(Circle2D circle){

        double radius1 = getRadius();

        double radius2 = circle.getRadius();

        return getDistance(circle) <= radius1 + radius2;
    }
}
