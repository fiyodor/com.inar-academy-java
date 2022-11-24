package chapters.chapter_06.Exercises;

public class Exercise_11 {

    public static void main(String[] args) {

        System.out.println("Sales Amount    Commission");
        System.out.println("------------------------------");

        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000)

            System.out.printf("%-6.0f          %-7.1f\n", salesAmount, computeCommission(salesAmount));
    }

    public static double computeCommission(double salesAmount){

        double commission = 0;

        double balance = 0;

            if(salesAmount > 10000){

                commission += (balance = salesAmount - 10000) * 0.12;
            }
            if(salesAmount > 5000){

                commission += (balance -= balance - 5000) * 0.10;
            }
            if(salesAmount > 0){

                commission += balance * 0.08;
            }

        // System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
        return commission;
    }
}
