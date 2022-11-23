package chapters.chapter_10.Exercises.Exercise_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {

        if(numberOfStudents >= students.length){

            String[] tempStudent = new String[students.length * 2];

            System.arraycopy(students, 0, tempStudent, 0, students.length);

            students = tempStudent;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {

        int indexOfStudent = findStudentIndex(student);

        if(indexOfStudent == -1){

            System.out.print("No student " + student);

            return;
        }

            for(int i = indexOfStudent; i < numberOfStudents - 1; i++) {

                students[i] = students[i + 1];
            }
            numberOfStudents--;
    }
    public int findStudentIndex(String student){

        for(int i = 0; i < students.length; i++) {

            if(students[i].equals(student)){

                return i;
            }
        }
        return -1;
    }
    public void clear(){

        String[] students = new String[5];

        numberOfStudents = 0;
    }
    public void displayStudents(){

        for(int i = 0; i < numberOfStudents; i++) {

            System.out.println(students[i]);

        }
    }
}
