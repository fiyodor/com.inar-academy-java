package chapters.chapter_12.Exercises.Exercise_04;

public class Exercise_04_Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /* Default constructor */
    public Exercise_04_Loan() {
        this(2.5, 1, 100);
    }

    /* Construct a loan with specified annual interest rate, number of years, and loan amount */

    public Exercise_04_Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException {

            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();

        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {

            if(annualInterestRate <= 0){

                throw new IllegalArgumentException("Wrong input. Annual interest rate must be bigger than 0");
            }
            if(numberOfYears <= 0){

                throw new IllegalArgumentException("Wrong input. Number of years must be bigger than 0");
            }
            if(loanAmount <= 0){

                throw new IllegalArgumentException("Wrong input. Loan amount must be bigger than 0");
            }


        }
    }

    /* Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /* Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /* Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /* Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /* Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /* Set a new loanAmount */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /* Find monthly payment */
    public double getMonthlyPayment(){

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment =loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        return monthlyPayment;
    }

    /* Find total payment */
    public double getTotalPayment(){

        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /* Return loan date */
    public java.util.Date getLoanDate() {

        return loanDate;
    }
}