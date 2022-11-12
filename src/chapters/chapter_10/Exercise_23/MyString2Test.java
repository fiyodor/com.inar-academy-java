package chapters.chapter_10.Exercise_23;

public class MyString2Test {

    public static void main(String[] args) {

        String str = "Ertugrul";

        MyString2 str1 = new MyString2("Ertugrul");

        MyString2 str2 = new MyString2("Ertus");

        MyString2 str3 = new MyString2("Ertugrul Donmez");

        MyString2 str4 = new MyString2("Ert");

        MyString2 str5 = str3.substring(2);

        MyString2 str6 = str3.substring(9);

        MyString2 str7 = str6.toUpperCase();

        MyString2 str8 = str3.toUpperCase();

        boolean truee = true;

        MyString2 valueOfTruee = MyString2.valueOf(truee);

        boolean falsee = false;

        MyString2 valueOfFalsee = MyString2.valueOf(falsee);

        char[] ch = str3.toChars();

        System.out.println(str1);
        System.out.println(str1.compare(str));
        System.out.println(str2.compare(str));
        System.out.println(str3.compare(str));
        System.out.println(str4.compare(str));
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(valueOfTruee);
        System.out.println(valueOfFalsee);

        for(int i = 0; i < ch.length; i++) {

            System.out.print(ch[i] + "/");
        }
        System.out.println();

        System.out.println(new MyString2("ABC").compare("ABC"));
        System.out.println(new MyString2("ABC").compare("ABD"));
        System.out.println(new MyString2("ABC").compare("ACC"));
        System.out.println(new MyString2("ABC").compare("ABCDE"));
        System.out.println(new MyString2("ABC").compare("ZBC"));
        System.out.println(new MyString2("A").compare("Z"));

        System.out.println(new MyString2("ertugrul").compare("ertz"));
    }
}
