package chapters.chapter_11.Checkpoints.Checkpoint_04_A;

public class C {
    public static void main(String[] args) {
        B b = new B();
    }
}


// psvm invoke class B's default constructor which calls class A. when we run we can see "A's no-arg constructor is invoked"