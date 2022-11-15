package chapters.chapter_11.Exercise_03;

public class SavingsAccount extends Account{

    public SavingsAccount(){

        super();
    }

    public SavingsAccount(int id, double balance){

        super(id, balance);

    }

    public void withdraw(double amount){

        if(getBalance() >= amount){

            setBalance(getBalance() - amount);
            System.out.println("You withdrew " + amount + "$. Your balance is now " + getBalance() + "$");
        }

        else{

            System.out.println("Your limit is: " + getBalance() + ". You can't withdraw " + amount + "$");
        }

    }

    public String toString(){

        return super.toString() + "\nThis is a savings account";
    }
}
