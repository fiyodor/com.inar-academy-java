package weeks.week_12.Student;

public class StudentTest {

    public static void main(String[] args) {

        Student ali = new Student("Ali", "Adalı", 4202, "aadali@itu.edu.tr");
        ali.print();

        Student haluk = new Student();
        haluk.setName("Haluk");
        haluk.setSurname("Dundar");
        haluk.print();
        haluk.setId(4211);
        System.out.println("Student number is" + Student.getCounter());
    }
}
