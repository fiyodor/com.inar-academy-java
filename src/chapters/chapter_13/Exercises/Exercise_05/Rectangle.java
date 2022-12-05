package chapters.chapter_13.Exercises.Exercise_05;

public class Rectangle extends GeometricObject {

    double width = 1 ;
    double height = 1 ;
    Rectangle(){}

    Rectangle(double width , double height){
        this.width = width ;
        this.height = height ;
    }
    public double getArea(){
        return width * height ;
    }
    public double getPerimeter(){
        return 2 * (width + height) ;
    }
}
