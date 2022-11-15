package chapters.chapter_11.Exercise_03;

public class Exercise_03 {

    public static void main(String[] args) {

        Account account = new Account(100, 100_000);
        CheckingAccount checkingAccount = new CheckingAccount(101, 8800, 200);
        SavingsAccount savingsAccount = new SavingsAccount(102, 100_000);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);

        System.out.println("-----------------------------------------------------");

        checkingAccount.withdraw(9000);
        System.out.println(checkingAccount);

        System.out.println("-----------------------------------------------------");
        savingsAccount.withdraw(100_001);
        System.out.println("-----------------------------------------------------");

        account.setAnnualInterestRate(5);
        System.out.println(account);

        System.out.println("-----------------------------------------------------");

        savingsAccount.withdraw(100_000);
        System.out.println("-----------------------------------------------------");
        System.out.println(savingsAccount);
    }
}

