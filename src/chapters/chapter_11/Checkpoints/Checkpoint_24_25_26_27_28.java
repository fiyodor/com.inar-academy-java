/*package chapters.chapter_11.Checkpoints;

public class Checkpoint_24_25_26_27 {

    /*24 => True. You can always successfully cast an instance of a subclass to a superclass. circle to geometricObject
    * False. You cant always successfully cast an instance of a superclass to a subclass.  geometricObject to circle x
    *
    * 25
    * a => (circle instanceof GeometricObject)          true
            (object instanceof GeometricObject)         true
            (circle instanceof Circle)                  true
            (object instanceof Circle)                  false
            *

     b =>  Circle circle = new Circle(5);
            GeometricObject object = circle;     can be compiled. upcasting is allowed without doing anything
            *


     *c => GeometricObject object = new GeometricObject();
            Circle circle = (Circle)object;       runtime exception(classCastException
            *
            *
            *
      26 =>
      *
      * a. Is fruit instanceof Fruit?               true
        b. Is fruit instanceof Orange?              false
        c. Is fruit instanceof Apple?               true
        d. Is fruit instanceof GoldenDelicious?     true
        e. Is fruit instanceof McIntosh?            false
        f. Is orange instanceof Orange?             true
        g. Is orange instanceof Fruit?              true
        h. Is orange instanceof Apple?              false
        i. Suppose the method makeAppleCider is defined in the Apple class. Can fruit           false(with (Apple)fruit.makeAppleCider it is possible)/fLSE
        invoke this method? Can orange invoke this method?
        j. Suppose the method makeOrangeJuice is defined in the Orange class. Can               true/false
        orange invoke this method? Can fruit invoke this method?
        k. Is the statement Orange p = new Apple() legal?                                       false
        l. Is the statement McIntosh p = new Apple() legal?                                     false
        m. Is the statement Apple p = new McIntosh() legal?                                     true
        *
        */

/*    public static void main(String[] args) {                // ClassCastException

        Object fruit = new Fruit();
        Object apple = (Apple)fruit;
    }
}
class Apple extends Fruit {
}
class Fruit {
}

/*equals and toString are defined in Object class, so every class they are reachable, toString method used to get information from classes. and equals used to compare
*
* contents of 2 objects. it is appropriate to override this methods to get useful data*/

