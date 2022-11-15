package chapters.chapter_11.Exercises.Exercise_01;

public class GeometricObject {

    protected String color;
    protected boolean filled;

    public GeometricObject() {

        this("White", false);
    }

    public GeometricObject(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){

        return "Color: " + getColor() + " and " + (isFilled() ? "Filled" : "Empty");
    }
}
