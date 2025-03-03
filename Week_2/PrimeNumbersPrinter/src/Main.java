import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;

            System.out.print("Въведи едно число за начало на диапазона: ");
            int number1 = scanner.nextInt();

            System.out.print("Въведи едно число за край на диапазона: ");
            int number2 = scanner.nextInt();

            for (int i = number1; i<= number2;i++ ) {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                        else {
                            isPrime = true;
                        }
                    }

                if (isPrime) {
                    System.out.println(i + " е просто число.");
                }
            }
    }
}