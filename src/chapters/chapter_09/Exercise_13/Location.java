package chapters.chapter_09.Exercise_13;

public class Location {

    private int row;
    private int column;
    private double maxValue;

    public Location(int row, int column, double maxValue){

        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public String toString(){

        String result = "The location of the largest element  " + getMaxValue() + " is at (" + getRow() + ", " + getColumn() + ")";

        return result;
    }
}
