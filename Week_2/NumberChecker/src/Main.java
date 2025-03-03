import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeat = 0;

        boolean isPrime = true;
        while (repeat != 1) {
            System.out.print("Въведи едно число за да проверим дали е просто: ");
            int number = scanner.nextInt();
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + " е просто число.");
            } else {
                System.out.println(number + " не е просто число.");
            }
            System.out.println("Ако искаш да продължиш натисни 0");
            System.out.println("Ако искаш да прекратиш 1");
            repeat = scanner.nextInt();
        }
        System.out.println("Твоята сесия приключи.");


    }
}