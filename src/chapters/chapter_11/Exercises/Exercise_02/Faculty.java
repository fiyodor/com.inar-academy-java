package chapters.chapter_11.Exercises.Exercise_02;

import chapters.chapter_10.Exercises.Exercise_14.MyDate;

public class Faculty extends Employee{

    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank){

        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString(){

        return "\nTHIS IS THE FACULTY CLASS" + super.toString() + "\nOffice Hours: " + getOfficeHours() + "\nRank: " + getRank();
    }
}
