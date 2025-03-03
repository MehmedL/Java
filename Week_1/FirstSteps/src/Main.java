import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Как се казваш бре? ");
        String name = scanner.nextLine();
        System.out.print("На колко години си идиот? ");
        int age = scanner.nextInt();
        System.out.println("Значи ти си "+name+" и си на "+age+" години.");
        System.out.println("Good!!!");

    }
}