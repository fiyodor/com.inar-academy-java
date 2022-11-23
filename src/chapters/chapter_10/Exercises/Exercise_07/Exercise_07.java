package chapters.chapter_10.Exercises.Exercise_07;

import java.util.Scanner;

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account[] accounts = createAccount(10);

        atm(accounts, input);



    }
    public static Account[] createAccount(int number){

        Account[] accounts = new Account[number];

        for(int i = 0; i < number; i++) {

            accounts[i] = new Account(i, 100);
        }
        return accounts;
    }
    public static void atm(Account[] accounts, Scanner input){

        int menuIndicator;

        while (true) {

            System.out.print("Enter an id: ");

            int id = input.nextInt();

            while (true){

                showMenu();

                System.out.print("Enter a choice: ");

                menuIndicator = input.nextInt();

                if(menuIndicator == 1){

                    checkBalance(accounts[id]);

                    System.out.println();
                }
                else if(menuIndicator == 2) {

                    accounts[id].withdraw(getWithdrawAmount(accounts[id], input));

                    System.out.println();
                }
                else if(menuIndicator == 3) {

                    accounts[id].deposit(getDepositAmount(accounts[id], input));

                    System.out.println();
                }
                else if(menuIndicator == 4) {

                    break;
                }
                else {

                    System.out.println("Enter a valid choise");
                }
            }

        }

    }

    public static void showMenu(){

        System.out.println("Main Menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }

    public static void checkBalance(Account accounts){

        System.out.println("The balance is " + accounts.getBalance());
    }

    public static double getWithdrawAmount(Account accounts, Scanner input){

        System.out.print("Enter an amount to withdraw: ");

        /*double withdrawAmount = input.nextDouble();

        return withdrawAmount; */

        return input.nextDouble();
    }

    public static double getDepositAmount(Account accounts, Scanner input){

        System.out.print("Enter an amount to deposit: ");

        /*double withdrawAmount = input.nextDouble();

        return withdrawAmount; */

        return input.nextDouble();
    }
}
