package chapters.chapter_11.Exercise_03;

public class CheckingAccount extends  Account{

    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {

        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount){

        if(getBalance() - amount >= 0 - getOverdraftLimit()){

            setBalance(getBalance() - amount);

            System.out.println("You withdrew " + amount + "$. Your balance is now " + getBalance() + "$");

        }
        else {

            System.out.println("\nYou have " + getBalance() + "$. You can withdraw " +(getBalance() + getOverdraftLimit()));
        }
    }

    public String toString(){

        return super.toString() + "\nOverdraft Limit: " + getOverdraftLimit();
    }
}
