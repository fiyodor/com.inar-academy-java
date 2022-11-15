package chapters.chapter_11.Exercises.Exercise_03;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id, double balance){

        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    public Account(){

        /*this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0; */
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){

        return getAnnualInterestRate() / 100 / 12;
    }
    public double getMonthlyInterest(){

        return getMonthlyInterestRate() * getBalance();
    }
    public void withdraw(double amount){

        setBalance(getBalance() - amount);
    }
    public void deposit(double amount){

        setBalance(getBalance() + amount);
    }

    public String toString(){

        return "\nId: " + getId() + "\nBalance: " + getBalance() + "\nMonthly interest: " + getMonthlyInterest() + "\nDate created: " + getDateCreated();
    }
}
