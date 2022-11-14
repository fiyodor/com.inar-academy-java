package chapters.chapter_11.Exercise_02;

import chapters.chapter_10.Exercise_14.MyDate;

public class Employee extends Person{

    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(){

        super();
    }

    public Employee(String name){

        super(name);
        this.office = office;
    }

   /* public Employee(String office) {
        this.office = office;
    }*/

    public Employee(String name, String office, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.office = office;
    }

    public Employee(String name,String office, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.office = office;
    }

    public Employee(String name, String office, String address) {
        super(name, address);
        this.office = office;
    }

    public Employee(String name, String office) {
        super(name);
        this.office = office;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String address, String phoneNumber, String email, double salary) {
        super(name, address, phoneNumber, email);
        this.salary = salary;
    }

    public Employee(String name, String address, String phoneNumber, double salary) {
        super(name, address, phoneNumber);
        this.salary = salary;
    }

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, String office, String address, String phoneNumber, String email, double salary) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
    }

    public Employee(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String email, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, MyDate dateHired) {
        super(name, address, phoneNumber);
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, MyDate dateHired) {
        super(name, address);
        this.dateHired = dateHired;
    }

    public Employee(String name, MyDate dateHired) {
        super(name);
        this.dateHired = dateHired;
    }

    public Employee(String name, String office, String address, String phoneNumber, String email, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.dateHired = dateHired;
    }

    public Employee(double salary, MyDate dateHired) {
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, String email, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, String phoneNumber, double salary, MyDate dateHired) {
        super(name, address, phoneNumber);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String address, double salary, MyDate dateHired) {
        super(name, address);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, double salary, MyDate dateHired) {
        super(name);
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name, String office, String address, String phoneNumber, String email, double salary, MyDate dateHired) {
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

    public String getDateHired() {
        return dateHired.getDay() + "." + dateHired.getMonth() + "." + dateHired.getYear();
    }

    public void setDateHired(MyDate dateHired) {
        dateHired = new MyDate();
    }

    public String toString(){

        return "\nTHIS IS THE EMPLOYEE CLASS" + super.toString() + "\nOffice: " + getOffice() + "\nSalary: " + getSalary() + "\nDate hired: " + getDateHired();
    }
}
