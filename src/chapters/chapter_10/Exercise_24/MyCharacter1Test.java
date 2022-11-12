package chapters.chapter_10.Exercise_24;

public class MyCharacter1Test {

    public static void main(String[] args) {


        MyCharacter1 ch1 = new MyCharacter1('e');

        MyCharacter1 ch2 = new MyCharacter1('e');

        MyCharacter1 ch3 = new MyCharacter1('d');

        MyCharacter1 ch4 = new MyCharacter1('f');

        System.out.println(ch1);

        System.out.println(ch2);

        System.out.println(ch1.compare(ch2));

        System.out.println(ch1.compare(ch3));

        System.out.println(ch1.compare(ch4));

        System.out.println(MyCharacter1.toUpperCase('z'));

        System.out.println(MyCharacter1.toLowerCase('A'));

        System.out.println(MyCharacter1.isLetter('2'));

        System.out.println(MyCharacter1.isDigit('Q'));

        System.out.println(MyCharacter1.valueOf('W'));


    }
}
