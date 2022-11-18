package chapters.chapter_11.Exercises.Exercise_10;

import java.util.Scanner;

public class Exercise_10 {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_STRINGS = 5;

        System.out.print("Enter " + NUMBER_OF_STRINGS + " strings: ");

        for(int i = 0; i < NUMBER_OF_STRINGS; i++) {

            myStack.add(input.next());
        }

        System.out.println(myStack);

        System.out.print("In reverse order: ");

        for(int i = 0; i < myStack.getSize(); i++) {

            System.out.print(myStack.pop() + " ");

            i--;
        }
    }
}
