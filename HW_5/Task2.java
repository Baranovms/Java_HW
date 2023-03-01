// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.


package Java_HW.HW_5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Иван", "Петр", "Антон", "Сергей", "Иван", "Антон", "Михаил", "Роман",
                "Антон", "Иван", "Антон", "Иван", "Петр", "Антон", "Сергей", "Антон", "Антон"};
        HashMap<String, Integer> worker = new HashMap<>();
        for (String i : names) {
            int value = worker.getOrDefault(i, 0) + 1;
            worker.put(i, value);
        }
        System.out.println(worker);

        worker.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
