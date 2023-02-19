
// Реализуйте алгоритм сортировки пузырьком числового массива,
//  результат после каждой итерации запишите в лог-файл.

package Java_HW.HW_2;

import java.io.IOException;
import java.util.logging.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("logsTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = { 4, 7, 1, -8, 2, 32, 0, 15};
        lib.printArrayInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        lib.printArrayInt(newArr);
    }

    public static int[] listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

}
