import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Фиксирани обменни курсове спрямо лева
        double usdRate = 1.75;
        double eurRate = 1.95;
        double gbpRate = 2.25;
        double chfRate = 2.10;
        double jpyRate = 0.016;

        // Въвеждане на сума в лева
        System.out.printf("Моля, въведете сума в лева:");
        double bgnAmount = scanner.nextDouble();

        // Конвертиране в различни валути
        double usdAmount = bgnAmount / usdRate;
        double eurAmount = bgnAmount / eurRate;
        double gbpAmount = bgnAmount / gbpRate;
        double chfAmount = bgnAmount / chfRate;
        double jpyAmount = bgnAmount / jpyRate;

        // Принтиране на резултатите
        System.out.println("Сума в различни валути:");
        System.out.printf("USD: %.2f%n", usdAmount);
        System.out.printf("EUR: %.2f%n", eurAmount);
        System.out.printf("GBP: %.2f%n", gbpAmount);
        System.out.printf("CHF: %.2f%n", chfAmount);
        System.out.printf("JPY: %.2f%n", jpyAmount);

        scanner.close();
    }
}
