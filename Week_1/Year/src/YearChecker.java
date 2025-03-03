import java.util.Scanner;

public class YearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checker = 1;
        while (checker != 0) {
            System.out.print("Въведете година: ");
            int year = scanner.nextInt();

            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println(year + " е високосна година.");
            } else {
                System.out.println(year + " не е високосна година.");
            }
            System.out.println("Ако искаш да продължиш да пресмяташ години натисни:");
            System.out.println("1");
            System.out.println("Ако искаш да прекъснеш натисни:");
            System.out.println("0");
            checker = scanner.nextInt();
        }
        System.out.println("Ти приключи да пресмяташ");
        scanner.close();
    }
}

