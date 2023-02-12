// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

package Java_HW.HW_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        System.out.print("Возможные действия:\n 1-сумма\n 2-разность\n 3-произведение\n 4-частное\n Ваш выбор: ");
        Scanner sc = new Scanner(System.in);
        int znak = sc.nextInt();
        System.out.print("Введите первое значение: ");
        int fNumb = sc.nextInt();
        System.out.print("Введите второе значение: ");
        int sNumb = sc.nextInt();
        switch (znak) {
            case 1:
                System.out.printf("Результат: %d + %d = %d\n", fNumb, sNumb, fNumb + sNumb);
                break;
            case 2:
                System.out.printf("Результат: %d - %d = %d\n", fNumb, sNumb, fNumb - sNumb);
                break;
            case 3:
                System.out.printf("Результат: %d * %d = %d\n", fNumb, sNumb, fNumb * sNumb);
                break;
            case 4:
                if (sNumb != 0) {
                    System.out.printf("Результат: %d / %d = %d\n", fNumb, sNumb, fNumb / sNumb);
                    break;
                } else {
                    System.out.printf("Деление на 0!!! Попробуйсте снова.");
                    break;
                }

        }
        sc.close();
    }
}