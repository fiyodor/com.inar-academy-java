package chapters.chapter_11.Exercise_02;

import chapters.chapter_10.Exercise_14.MyDate;

public class Staff extends Employee{

    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {

        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){

        return "\nTHIS IS THE STAFF CLASS" + super.toString() + "\nTitle: " + getTitle();
    }
}
