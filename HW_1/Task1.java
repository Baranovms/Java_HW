// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Java_HW.HW_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите максимальное значение: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.printf("Треугольное число: %d\n", (N * (N + 1)) / 2);
        System.out.printf("Факториал числа %d: %d", N, fact);

        sc.close();
    }
}
