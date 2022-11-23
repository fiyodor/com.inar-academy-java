package chapters.chapter_10.Exercises.Exercise_22;

public class MyStringTest {

    public static void main(String[] args) {

        MyString1 str1 = new MyString1(new char[]{'E','r', 't','u', 'g','r', 'u','l', ' ','D', 'O','N', 'M','E', 'Z'});

        MyString1 str2 = str1.toLowerCase();

        MyString1 str3 = str1.substring(0, 3);

        MyString1 str4 = new MyString1(new char[]{'E','r', 't','u', 'g','r', 'u','l', ' ','D', 'O','N', 'M','E', 'Z'});

        MyString1 str5 = MyString1.valueOf(333);

        System.out.println(str1);

        System.out.println(str2);

        System.out.println(str3);

        System.out.println(str1.equals(str3));

        System.out.println(str1.equals(str4));

        System.out.println(str5);
    }
}
