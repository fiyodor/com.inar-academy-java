package chapters.chapter_10.Exercise_04;

public class MyPoint {

    private double x;
    private double y;

    public MyPoint(double x, double y){

        this.x = x;
        this.y = y;
    }
    public MyPoint(){

        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(MyPoint point){

        double px = Math.pow(getX() - - point.getX(), 2);
        double py = Math.pow(getY() - point.getY(), 2);

        return Math.sqrt(px + py);


    }
    public double distance(double x, double y){

        double px = Math.pow(getX() - - x, 2);
        double py = Math.pow(getY() - y, 2);

        return Math.sqrt(px + py);
    }
}
