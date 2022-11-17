package chapters.chapter_11.Exercises.Exercise_05;

public class CourseTest {

    public static void main(String[] args) {

        Course inar = new Course("Inar Academy");

        inar.addStudent("Ertuğrul");
        inar.addStudent("Haluk");
        inar.addStudent("Hakan");
        inar.addStudent("Furkan");
        inar.addStudent("Kenan");

        String[] students = inar.getStudents();

        System.out.println(inar.getCourseName());

        inar.displayStudents();         // instead of for loop

        System.out.println("\nNumber of students is : " + inar.getNumberOfStudents());

        System.out.println("---------------------------------");

        inar.dropStudent("Ertuğrul");
        inar.dropStudent("Kenan");

        students = inar.getStudents();

        System.out.println(inar.getCourseName());

        inar.displayStudents();         // instead of for loop

        System.out.println("\nNumber of students is : " + inar.getNumberOfStudents());
    }
}
