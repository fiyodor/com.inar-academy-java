package chapters.chapter_11.Checkpoints;

public class Checkpoint_22 {

    public static void main(String[] args) {
        A a = new A(3);
    }
}
class A extends B {
    public A(int t) {
        System.out.println("A's constructor is invoked");
    }
}
class B {
    public B() {
        System.out.println("B's constructor is invoked");
    }
}

/* no-arg constructor of Object wasnt invoked when new A(3) is invoked */
