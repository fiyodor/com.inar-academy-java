package chapters.chapter_11.Exercises.Exercise_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private String name;
    private ArrayList<Transaction> transactions;
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

        this("Default", 0, 0);
    }
    public Account(String name, int id, double balance){

        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate(){

        return getAnnualInterestRate() / 100 / 12;
    }
    public double getMonthlyInterest(){

        return getMonthlyInterestRate() * getBalance();
    }
    public void withdraw(double amount){

       Transaction transaction = new Transaction('W', amount , balance, amount + "$ added");
       setBalance(getBalance() - amount);
       transactions.add(transaction);


    }
    public void deposit(double amount){

        Transaction transaction = new Transaction('D', amount, balance, amount + "$ added");
        setBalance(getBalance() + amount);
        transactions.add(transaction);
    }

    public String toString(){

        String str = "";

        for(int i = 0; i < transactions.size(); i++) {

            str += transactions.get(i);
        }

        return "\nName: " + getName() + "\nBalance: " + getBalance() + "\nMonthly interest: " + getMonthlyInterest() + "\nDate created: " + getDateCreated() + "\nTransactions: " + str;
    }
}
