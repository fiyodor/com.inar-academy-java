package weeks.week_15.Calculator;

public class Number {

    private int value;

    public Number(int value){

        this.value = value;
    }

    public Number(){

        this(0);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
