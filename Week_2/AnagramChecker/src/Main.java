import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведи първия стринг:");
        String str1 = scanner.nextLine();

        System.out.println("Въведи втория стринг:");
        String str2 = scanner.nextLine();

        scanner.close();

        if (areAnagrams(str1, str2)) { // Проверка дали двата стринга са анаграми
            System.out.println(str1 + " и " + str2 + " са анаграми.");
        } else {
            System.out.println(str1 + " и " + str2 + " не са анаграми."); 
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) { // Проверка дали дължината на двата стринга е различна
            return false; // Връщане на false, ако дължините са различни
        }

        char[] charArray1 = str1.toCharArray(); // Преобразуване на първия стринг в масив от символи
        char[] charArray2 = str2.toCharArray(); // Преобразуване на втория стринг в масив от символи

        Arrays.sort(charArray1); // Сортиране на масива от символи на първия стринг
        Arrays.sort(charArray2); // Сортиране на масива от символи на втория стринг

        return Arrays.equals(charArray1, charArray2); // Връщане на резултата от сравнение на двата сортирани масива
    }
}
