// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

package Java_HW.HW_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String str = "empty";
        try (BufferedReader br = new BufferedReader(new FileReader("Java_HW/HW_2/Text1.txt"))) {
            StringBuilder strBuilder = new StringBuilder();
            str = br.readLine();
        }
        StringBuilder strBuilder = new StringBuilder("SELECT * FROM students WHERE ");

        str = str.substring(1, str.length() - 1);
        String[] arrStrings = str.split(", ");
        boolean first = true;
        for (String string : arrStrings) {
            String[] keyValueStrings = string.split(":");
            String key = keyValueStrings[0];
            key = key.substring(1, key.length() - 1);
            String value = keyValueStrings[1];
            
            if (value.equals("\"null\""))
                continue;
                if (!first)
                    strBuilder.append(" AND ");
                first = false;
                strBuilder.append(String.format("%s = %s", key, value));
                
        }
        strBuilder.append(";");

        System.out.println(strBuilder.toString());
    }

}
