package chapters.chapter_09.Exercise_02;

public class StockTest {

    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");

        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("The price-chance percentage is " + stock1.getChangePercent());

    }
}
