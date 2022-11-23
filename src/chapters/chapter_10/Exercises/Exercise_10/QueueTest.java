package chapters.chapter_10.Exercises.Exercise_10;

public class QueueTest {

    public static void main(String[] args) {

        Queue queue = new Queue();

        for(int i = 1; i < 21; i++) {

            queue.enqueue(i);

        }
        System.out.print("The queue is: ");

        queue.displayQueue();

        System.out.println("Size of queue: " + queue.getSize());

        System.out.println("----------------------------------------------------------------");

        while (!queue.empty()){

            System.out.print("Dequeued: ");

            System.out.println(queue.dequeue());

            System.out.print("The queue is: ");

            queue.displayQueue();

            System.out.println("Size of queue: " + queue.getSize());

            System.out.println("----------------------------------------------------------------");

        }

    }
}
