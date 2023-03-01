// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
package Java_HW.HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        HashMap<ArrayList<String>, HashMap<String, String>> phoneBook = new HashMap<>();
        ArrayList<String> phoneNumber = new ArrayList<>();
        HashMap<String, String> keyValue = new HashMap<>();

        phoneBook.put(addPhoneNumber(phoneNumber), addDescription(keyValue));
        System.out.println(phoneBook);
    }

    public static ArrayList<String> addPhoneNumber(ArrayList<String> number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер телефона:");
        String inputPhone = scanner.nextLine();
        number.add(inputPhone);
        scanner.close();
        return number;
    }

    public static HashMap<String, String> addDescription(HashMap<String, String> keyValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String secondName = scanner.nextLine();
        System.out.println("Введите описание:");
        String comment = scanner.nextLine();

        keyValue.put("firstName", firstName);
        keyValue.put("secondName", secondName);
        keyValue.put("description", comment);

        scanner.close();
        return keyValue;
    }
    
}
