package chapters.chapter_11.Checkpoints.Checkpoint_21_B;

public class Checkpoint_22_B {

    public static void main(String[] args) {
        new Person().printPerson();
        new Student().printPerson();
    }
}
class Student extends Person {
    private String getInfo() {
        return "Student";
    }
}
class Person {
    private String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}
