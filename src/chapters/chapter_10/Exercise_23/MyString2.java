package chapters.chapter_10.Exercise_23;

import chapters.chapter_10.Exercise_22.MyString1;

public class MyString2 {

    private char[] ch;

    public MyString2(String s){

        this.ch = s.toCharArray();
    }

    public MyString2(char[] charArray){

        this.ch = charArray;
    }

    public MyString2 substring(int begin){

        char[] c = new char[ch.length - begin];

        for(int i = 0; i < c.length; i++) {

            c[i] = ch[begin];

            begin++;
        }
        return new MyString2(c);
    }

    public MyString2 toUpperCase(){

        char[] c = new char[ch.length];

        for(int i = 0; i < c.length; i++) {

            if(ch[i] >= 'a' && ch[i] <= 'z'){

                c[i] = (char)(ch[i] - ('a' - 'A'));
            }
            else {

                c[i] = ch[i];
            }
        }
        return new MyString2(c);
    }

    public char[] toChars(){

        return ch;
    }

    public static MyString2 valueOf(boolean b){

        return new MyString2(b ? "true" : "false");
    }

    public int compare(String s){

        if(ch.length == s.length()){

            return 0;
        }
        else if(ch.length > s.length()){

            return 1;
        }
        else{

            return -1;
        }


    }

    public String toString(){

        return new String(ch);
    }
}
