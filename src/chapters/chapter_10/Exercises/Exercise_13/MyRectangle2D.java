package chapters.chapter_10.Exercises.Exercise_13;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double heigth;

    public MyRectangle2D(){

        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double heigth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getArea(){

        return getHeight() * getWidth();
    }

    public double getPerimeter(){

        return 2 * ( getHeight() + getWidth());
    }

    public boolean contains(MyRectangle2D r){

        double[][] cornerOsfR1 = findCorners(r);

        for(int i = 0; i < cornerOsfR1.length; i++) {

            if(!contains(cornerOsfR1[i][0], cornerOsfR1[i][1])){

                return false;
            }
        }
        return true;
    }
    public boolean contains(double x, double y){

        return ((x <= getX() + getWidth() / 2) && (x >= getX() - getWidth() / 2)) && ((y <= getY() + getHeight() / 2) && (y >= getY() - getHeight() / 2));
    }
    public double[][] findCorners(MyRectangle2D r){

        double[][] corner = new double[4][2];

        corner[0][0] = r.getX() - getWidth() / 2;
        corner[0][1] = r.getY() + getHeight() / 2;
        corner[1][0] = r.getX() + getWidth() / 2;
        corner[1][1] = r.getY() + getHeight() / 2;
        corner[2][0] = r.getX() - getWidth() / 2;
        corner[2][1] = r.getY() - getHeight() / 2;
        corner[3][0] = r.getX() + getWidth() / 2;
        corner[3][1] = r.getY() - getHeight() / 2;

        return corner;
    }

    public boolean overlaps(MyRectangle2D r){

        boolean cond1 = getY() + (getHeight() / 2) >= r.getY() - (r.getHeight() / 2);
        boolean cond2 = getY() - (getHeight() / 2) <= r.getY() + (r.getHeight() / 2);
        boolean cond3 = getX() + (getWidth() / 2) >= r.getX() - (r.getWidth() / 2);
        boolean cond4 = getX() - (getWidth() / 2) <= r.getX() + (r.getWidth() / 2);

        return (cond1 || cond2) || (cond3 || cond4);
    }


}
