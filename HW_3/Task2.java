// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Java_HW.HW_3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random my_random = new Random();

        for (int i = 0; i < 20; i++) {
            int array = my_random.nextInt(-20,20);
            list.add(array);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(list);
    }
}
