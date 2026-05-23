import java.util.Scanner;

public class TemperatureConverter {

    final double CELSIUS_TO_FAHRENHEIT_MULTIPLIER = 9.0 / 5.0;
    double celsius;

    void inputTemp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        celsius = sc.nextDouble();
        sc.close();
      
    }

    void displayTemp() {
        double f = celsius * CELSIUS_TO_FAHRENHEIT_MULTIPLIER + 32;

        System.out.println("Temp in Celsius: " + celsius);
        System.out.println("Temp in Fahrenheit is: " + f);
    }

    public static void main(String[] args) {
        TemperatureConverter temp1 = new TemperatureConverter();
        temp1.inputTemp();
        temp1.displayTemp();
    }
}