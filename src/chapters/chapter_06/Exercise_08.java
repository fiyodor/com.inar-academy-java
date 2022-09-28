package chapters.chapter_06;

public class Exercise_08 {

    public static void main(String[] args) {

        System.out.println("Celsius  Fahrenheit    |    Fahrenheit    Celsius");
        System.out.println("----------------------------------------------------");

        for (double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10){

           // System.out.println(celsius + "     " + celsiusToFahrenheit(celsius) + "        |    " + fahrenheit + "         " + fahrenheitToCelsius(fahrenheit));

            System.out.printf("%4.1f     %-6.1f        |    %-5.1f         %-10.2f\n",celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
        }

    }
    public static double celsiusToFahrenheit(double celsius){

        double fahrenheit = (9.0 / 5) * celsius + 32;

        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        return celsius;
    }
}
