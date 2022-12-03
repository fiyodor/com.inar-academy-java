package chapters.chapter_13.Checkpoints;

public class Checkpoint_17_18_19_20_21 {

    /*True
    *
    * public int compareTo(String o)
    *
    * n1 and n2 arent declared as the same so a compiler error will occur
    *
    * yes we can define compareTo method without implementing Comparable interface. with Comparable interface the objects can be passed to methods that use Comparable type as parameters
    *
    * */

    public static void main(String[] args) {
        Person[] persons = {new Person(3), new Person(4), new Person(1)};
        java.util.Arrays.sort(persons);
    }
}
class Person {                  //Person class doesnt implement Comparable interface so two person cant be compared by using compareTo
    private int id;
    Person(int id) {
        this.id = id;
    }
}
