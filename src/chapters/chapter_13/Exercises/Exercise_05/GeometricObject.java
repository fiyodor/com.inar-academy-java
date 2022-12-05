package chapters.chapter_13.Exercises.Exercise_05;

public abstract class GeometricObject implements Comparable<GeometricObject>{

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }


    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
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


    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Area : " + getArea() + "\n" + "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }


    public abstract double getArea();


    public abstract double getPerimeter();
    public static GeometricObject max (GeometricObject o1 , GeometricObject o2){
        int x = o1.compareTo(o2);
        if (x == -1){
            return o2;
        } else if (x == 1) {
            return o1 ;
        }
        else {
            return o1 ;
        }
    }
    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }


}
