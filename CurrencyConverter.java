import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Converter");
        System.out.print("Enter the base currency code (e.g., USD): ");
        String baseCurrency = scanner.next();

        System.out.print("Enter the target currency code (e.g., EUR): ");
        String targetCurrency = scanner.next();
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1.0) {
            System.out.println("Failed to fetch exchange rates. Exiting.");
            System.exit(1);
        }
        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amountToConvert = scanner.nextDouble();
        double convertedAmount = amountToConvert * exchangeRate;
        System.out.println("\nConversion Result:");
        System.out.println(amountToConvert + " " + baseCurrency + " is equal to " +
                convertedAmount + " " + targetCurrency);

        scanner.close();
    }


    private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
        return 1.2;
    }
}