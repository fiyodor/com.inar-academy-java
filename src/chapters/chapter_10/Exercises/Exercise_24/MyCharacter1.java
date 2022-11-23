package chapters.chapter_10.Exercises.Exercise_24;

public class MyCharacter1 {

    private char ch;

    public MyCharacter1(char ch){

        this.ch = ch;
    }

    public char charValue(){

        return ch;
    }

    public static MyCharacter1 valueOf(char c){

        return new MyCharacter1(c);
    }

    public int compare(char a, char b){

        return a - b;
    }

    public int compare(MyCharacter1 c){

        return charValue() - c.charValue();
    }

    public boolean equals(MyCharacter1 c){

        return compare(c) == 0;
    }

    public static boolean isLetter(char c){

        return ('A' <= c && c >= 'Z') || ('a' <= c && c >= 'z');
    }

    public static boolean isDigit(char c){

        return '0' <= c && c >= '9';
    }

    public static char toUpperCase(char c) {

        if(isLetter(c)) {

            return (char) (c - ('a' - 'A'));
        } else {

            return c;
        }
    }



    public static char toLowerCase(char c) {

        if(isLetter(c)) {

            return (char) (c + ('a' - 'A'));
        } else {

            return c;
        }
    }

    public static boolean isLowerCase(char c) {

        return ('a' <= c && c <= 'z');
    }

    public static boolean isUpperCase(char c) {

        return ('A' <= c && c <= 'Z');
    }

    public String toString(){

        return String.valueOf(ch);
    }





}
