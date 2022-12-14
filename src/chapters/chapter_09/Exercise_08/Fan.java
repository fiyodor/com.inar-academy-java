package chapters.chapter_09.Exercise_08;

public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){

        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){

        String result;

        if(isOn()){

            result = "Fan speed is " + getSpeed() + "\nColor is " + getColor() + "\nRadius is " + getRadius();
        }
        else {

            result = "Fan is off" + "\nColor is " + getColor() + "\nRadius is " + getRadius();
        }
        return result;
    }
}
