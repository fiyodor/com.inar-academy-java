package chapters.chapter_11.Exercise_02;

import chapters.chapter_10.Exercise_14.MyDate;

public class Employee extends Person{

    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {

        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        dateHired = new MyDate();
    }

    public String toString(){

        return "\nTHIS IS THE EMPLOYEE CLASS" + super.toString() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "$" + "\nDate hired: " + getDateHired();
    }
}
