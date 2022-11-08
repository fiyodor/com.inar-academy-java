package chapters.chapter_10.Exercise_03;

public class MyInteger {

    private int value;

    public MyInteger(int value){

        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){

        return getValue() % 2 == 0;
    }
    public boolean isOdd(){

        return !isEven();
    }
    public boolean isPrime(){

        if(getValue() == 0 ||getValue() == 1){

            return false;
        }

        for(int i = 2; i < getValue(); i++) {

            if(getValue() % i == 0){

                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int value){

        return value % 2 == 0;
    }
    public static boolean isOdd(int value){

        return !isEven(value);
    }
    public static boolean isPrime(int value){

        if(value == 0 || value == 1){

            return false;
        }

        for(int i = 2; i < value; i++) {

            if(value % i == 0){

                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt){

        return myInt.isEven();
    }
    public static boolean isOdd(MyInteger myInt){

        return myInt.isOdd();
    }
    public static boolean isPrime(MyInteger myInt){

        return myInt.isPrime();
    }
    public boolean equals(int value){

        return getValue() == value;
    }
    public boolean equals(MyInteger myInt){

        return equals(myInt.getValue());
    }
    public static int parseInt(String str){

        return Integer.parseInt(str);
    }
    public static int parseInt(char[] ch){

        return parseInt(new String(ch));


    }
}
