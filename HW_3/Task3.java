//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

package Java_HW.HW_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        int elements = 20;
        for (int i = 0; i < elements; i++) {
            int randNum = rand.nextInt(100);
            list.add(randNum);
        }
        System.out.println(list);

        int numbMin = Collections.min(list);
        System.out.printf("Минимальное число в списке %d \n", numbMin);

        int numbMax = Collections.max(list);
        System.out.printf("Максимальное число в списке %d \n", numbMax);

        int listSum = list.stream().mapToInt(Integer::intValue).sum();
        int average = listSum / elements;
        System.out.printf("Среднее арифметическое в списке %d \n", average);
    }
}
