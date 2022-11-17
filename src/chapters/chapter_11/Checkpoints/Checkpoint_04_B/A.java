package chapters.chapter_11.Checkpoints.Checkpoint_04_B;

class A {
    public A(int x) {
    }
}
class B extends A {
    public B() {
    }
}

/* java: constructor A in class chapters.chapter_11.Checkpoints.Checkpoint_04_B.A cannot be applied to given types;
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length */

// this is the compile error. because class A has no default constructor. it has only one constructor with parameters.