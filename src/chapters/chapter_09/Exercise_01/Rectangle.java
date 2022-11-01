package chapters.chapter_09.Exercise_01;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(){

        this(1, 1);
    }
    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){

        return this.getHeight() * this.getWidth();
    }
    public double getPerimeter(){

        return 2 * (this.getWidth() + this.getHeight());
    }
    public void printRectangle(){

        System.out.println("The width is " + this.getWidth());
        System.out.println("The height is "  + this.getHeight());
        System.out.println("The area is " + getArea());
        System.out.println("The perimeter is " + getPerimeter());


    }
}
