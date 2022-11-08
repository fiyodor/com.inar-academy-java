package chapters.chapter_10.Exercise_03;

public class MyIntegerTest {

    public static void main(String[] args) {

        MyInteger num = new MyInteger(42082608);

        System.out.println(num.getValue());
        System.out.println(num.isEven());
        System.out.println(num.isOdd());
        System.out.println(num.isPrime());
        System.out.println(num.equals(42082608));
        System.out.println(num.equals(42082609));
        System.out.println(num.equals(new MyInteger(42082608)));
        System.out.println(num.equals(new MyInteger(42082609)));
        System.out.println(MyInteger.isEven(42082608));
        System.out.println(MyInteger.isOdd(42082608));
        System.out.println(MyInteger.isPrime(42082608));
        System.out.println(MyInteger.isPrime(97));
        System.out.println(MyInteger.parseInt("42082608"));
        System.out.println(MyInteger.parseInt(new String("42082608")));
        System.out.println(MyInteger.parseInt(new char[]{'4','2','0','8','2','6','0','8'}));


    }
}
