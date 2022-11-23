package chapters.chapter_10.Exercises.Exercise_08;

public class TaxTest {

    public static void main(String[] args) {

        double[] rate2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

        double[] rate2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] bracket2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };

        int[][] bracket2009 = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        Tax tax2001 = new Tax(0, bracket2001, rate2001, 50000);
        Tax tax2009 = new Tax(0, bracket2009, rate2009, 50000);

        displayTaxRates(tax2001, 2001);
        System.out.println("----------------------------------------------------------");
        displayTaxRates(tax2009, 2009);
    }
    public static void displayTaxRates(Tax tax, int year){

        System.out.println("       " + year + " United States Federal Personal Tax Rates");

        System.out.println();

        System.out.println("Income    Status 0     Status 1     Status 2      Status 3");

        System.out.println();

        for (int i = 50000; i <= 60000; i += 1000) {

            System.out.printf("%-10d", i);

            for (int j = 0; j <= 3; j++) {

                tax.setFilingStatus(j);

                tax.setTaxableIncome(i);

                System.out.printf("%-8.2f     ", tax.getTax());
            }
            System.out.println();
        }
    }
}
