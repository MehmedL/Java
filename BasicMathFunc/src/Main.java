import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("\nEnter number 2: ");
        double number2 = scanner.nextDouble();

        System.out.println("First number is "+number1+"");
        System.out.println("First number is "+number2+"");
        System.out.println("----------------------------------------------");

        double sum = number1 + number2;
        double Subtraction = number1 - number2;
        double multiply = number1 * number2;
        double division = number1 / number2;

        System.out.println("Sum = "+sum);
        System.out.println("Substraction = "+Subtraction);
        System.out.println("Multiply = "+multiply);
        System.out.println("Division = "+division);
    }
}
