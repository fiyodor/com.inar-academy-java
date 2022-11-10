package chapters.chapter_10.Exercise_10;

public class Queue {

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;
    /** Construct a stack with the default capacity 16 */
    public Queue() {
        this (DEFAULT_CAPACITY);
    }
    /** Construct a stack with the specified maximum capacity */
    public Queue(int capacity) {
        elements = new int[capacity];
    }
    /** Push a new integer to the top of the stack */
    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }
    /** Return and remove the top element from the stack */
    public int dequeue() {

        int firstElement = elements[0];

        for(int i = 0; i < elements.length - 1; i++) {

            elements[i] = elements[i + 1];
        }
        size--;

        return firstElement;
    }
    /** Return the top element from the stack */
    public int peek() {
        return elements[size - 1];
    }
    /** Test whether the stack is empty */
    public boolean empty() {
        return size == 0;
    }
    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
    public void displayQueue(){

        for(int i = 0; i < getSize(); i++) {

            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

}
