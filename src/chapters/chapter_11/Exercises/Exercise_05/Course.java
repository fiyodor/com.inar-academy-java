package chapters.chapter_11.Exercises.Exercise_05;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.numberOfStudents = 0;
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {

        students.add(student);
        numberOfStudents++;
    }

    public void dropStudent(String student) {

        if(students.contains(student)){

            students.remove(student);
            numberOfStudents--;
        }
        else {

            System.out.println("No student named " + student);
        }
    }
    public int findStudentIndex(String student){

        return students.indexOf(student);
    }

    public void clear(){

        students.clear();

        numberOfStudents = 0;

    }

    public void displayStudents(){

        for(int i = 0; i < students.size(); i++) {

            System.out.print(students.get(i) + " ");
        }
    }
}
