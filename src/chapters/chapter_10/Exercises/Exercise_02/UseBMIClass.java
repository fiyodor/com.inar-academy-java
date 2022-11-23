package chapters.chapter_10.Exercises.Exercise_02;

 public class UseBMIClass {

 public static void main(String[] args) {

     BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);

     System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

     BMI bmi2 = new BMI("Susan King", 215, 70);

     System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());

     BMI ert = new BMI("Ertugrul Donmez", 27, 194, 5, 11);

     System.out.println("The BMI for " + ert.getName() + " is " + ert.getBMI() + " " + ert.getStatus());

 }


 }
