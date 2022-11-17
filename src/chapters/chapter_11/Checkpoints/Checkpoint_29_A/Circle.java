package chapters.chapter_11.Checkpoints.Checkpoint_29_A;

public class Circle {

    double radius;
    public boolean equals(Circle circle) {              //it will be false because the declared types of circle1 and 2 are Object. for this reason circle1.equals(circle2)
        return this.radius == circle.radius;            //will match circle1.equals(Object circle)
    }
}
