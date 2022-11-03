package chapters.chapter_09.Exercise_07;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account(1122, 20000);

        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("The balance is " + account.getBalance() + "$");
        System.out.println("The monthly interest is " + account.getMonthlyInterest() + "$");
        System.out.printf("The date when this account was created is %s", account.getDateCreated());


    }
}
