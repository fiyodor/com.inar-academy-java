package chapters.chapter_11.Checkpoints.Checkpoint_29_B;

public class Circle {

    double radius;
    public boolean equals(Object circle) {    //it will be true because equals method of Object class is overriden by Circle class.
        return this.radius ==
                ((Circle)circle).radius;
    }
}
