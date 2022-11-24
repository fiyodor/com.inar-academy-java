package chapters.chapter_06.Exercises;

public class Exercise_12 {

    public static void main(String[] args) {

        char ch1 = '1';
        char ch2 = 'Z';

        int chPerLine = 10;

        printChars(ch1, ch2 , chPerLine);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){

        int counter = 0;

        System.out.println("The characters between " + ch1 + " and " + ch2 + ":");


        for (int i = ch1; i <= ch2; i++) {

            System.out.print((char)i + " ");

            counter++;

            if(counter % numberPerLine == 0){

                System.out.println();
            }

        }
    }
}
