package chapters.chapter_11.Checkpoints.Checkpoint_29_A;

public class Test {

    public static void main(String[] args) {                   //it will be false because the declared types of circle1 and 2 are Object. for this reason circle1.equals(circle2)
        Object circle1 = new Circle();                         //will match circle1.equals(Object circle)
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));            // if Object is replaced by Circle the outputs would be both true. circle1.equals(circle2) matches circle1.equals(Circle object)
    }                                                           // and for B it is true because this method is overridden
}
