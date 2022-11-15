package chapters.chapter_11.Exercises.Exercise_02;

public class Student extends Person{

    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int classStatus;

    public Student(String name, String address, String phoneNumber, String email, int classStatus) {

        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {

        String status;

        switch (classStatus){

           /* case 1 : return   "Freshman";
            case 2 : return  "Sophomore";
            case 3 : return  "Junior";
            case 4 : return  "Senior";
            default : return  "Not Mentioned";*/

            case 1 : status = "Freshman"; break;
            case 2 : status = "Sophomore"; break;
            case 3 : status = "Junior"; break;
            case 4 : status = "Senior"; break;
            default : status = "Not Mentioned";
        }
        return status;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "\nTHIS IS THE STUDENT CLASS" + super.toString() + "\nStatus: " + getClassStatus();
    }
}
