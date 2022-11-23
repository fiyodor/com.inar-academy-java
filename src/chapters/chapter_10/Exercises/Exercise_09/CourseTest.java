package chapters.chapter_10.Exercises.Exercise_09;

public class CourseTest {

    public static void main(String[] args) {

        Course course1 = new Course("Inar");

        course1.addStudent("ertugrul");
        course1.addStudent("mesut");
        course1.addStudent("haluk");
        course1.addStudent("beyza");
        course1.addStudent("zeynep");
        course1.addStudent("enes");
        course1.displayStudents();
        System.out.println(course1.getCourseName());
        course1.dropStudent("mesut");
        course1.displayStudents();
    }
}
