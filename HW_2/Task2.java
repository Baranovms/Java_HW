
// Реализуйте алгоритм сортировки пузырьком числового массива,
//  результат после каждой итерации запишите в лог-файл.

package Java_HW.HW_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class Task2 {
    private static Logger logger = Logger.getLogger(Task2.class.getName());

    public static void main(String[] args) throws IOException {    
        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            Random rand = new Random();
            mass[i] = rand.nextInt(100);
        }
        System.out.printf("Вывод неотсортированного массива: %s\n", Arrays.toString(mass));
        listSort(mass);
        System.out.printf("\nВывод отсортированного массива: %s\n", Arrays.toString(mass));
    }

    public static void listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - k - 1; i++)
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    logger.log(Level.INFO, String.format("%d <--> %d, %s",
                            arr[i], arr[i + 1], Arrays.toString(arr)));
                }
        }
    }
}
