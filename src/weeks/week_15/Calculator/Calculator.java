package weeks.week_15.Calculator;

public class Calculator {

    private static Number result;

    public Calculator(Number result){

        this.result = result;
    }

    public Calculator(){

        this(new Number());

    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    public static Number sum(Number n1, Number n2){

        result = new Number(n1.getValue() + n2.getValue());

        n1 = result;

        return result;
    }

    public static Number subtract(Number n1, Number n2){

        result = new Number(n1.getValue() - n2.getValue());

        n1 = result;

        return result;
    }

    public static Number multiply(Number n1, Number n2){

        result = new Number(n1.getValue() * n2.getValue());

        n1 = result;

        return result;
    }
    public static Number divide(Number n1, Number n2){

        result = new Number(n1.getValue() / n2.getValue());

        n1 = result;

        return result;
    }

    public static void chance(Number n1){

        n1.setValue(n1.getValue() * -1);
    }

    public static Number mod(Number n1, Number n2){

        result = new Number(n1.getValue() % n2.getValue());

        return result;
    }

    public static void reset(Number n1, Number n2){

        n1 = null;
        n2 = null;
    }

    public static void reset(Number n1){

        n1 = null;
    }

    public static void print(Number result){

        System.out.println("Result is " + result.getValue());

    }


}
