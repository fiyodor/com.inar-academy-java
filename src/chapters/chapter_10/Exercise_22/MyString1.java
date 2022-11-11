package chapters.chapter_10.Exercise_22;

public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars){

        this.chars = chars;
    }

    public char charAt(int i){

        return chars[i];
    }

    public int length(){

        return chars.length;
    }

    public MyString1 substring(int begin, int end){

        char[] ch = new char[end - begin];

        for(int i = 0; i < ch.length; i++) {

            ch[i] = chars[begin];

            begin++;
        }
        return new MyString1(ch);
    }

    public MyString1 toLowerCase(){

        char[] ch = new char[chars.length];

        for(int i = 0; i < chars.length; i++) {

            if(chars[i] >= 'A' && chars[i] <= 'Z'){

                ch[i] = (char)(chars[i] + ('a' - 'A'));
            }
            else {

                ch[i] = chars[i];
            }
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 s){

        int e = 162;

        if(s.length() != chars.length){

            return false;
        }
        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) != chars[i]){

                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i){

        int counterOfDigits = 0;

        int n = i;

        while(n > 0){

            n /= 10;

            counterOfDigits++;
        }
        char[] ch = new char[counterOfDigits];

        for(int j = counterOfDigits - 1; j >= 0; j--) {

            ch[j] = (char)('0' + (i % 10));

            i /= 10;
        }
        return new MyString1(ch);
    }

    public String toString(){

        return new String(chars);
    }


}
