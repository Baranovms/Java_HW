// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Java_HW.HW_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        String input = "empty";
        try (BufferedReader br = new BufferedReader(new FileReader("Java_HW/HW_2/Text3.txt"))) {
            input = br.readLine();
        }
        
        input = clip (input); // убрать []
        String[] students = input.split (", ");
        for (String student : students) {
            student = clip (student);
            String[] keyValues = student.split (",");
            String name = "", grade = "", subject = "";
            for (String keyValue : keyValues) {
                String[] keyValueParts = keyValue.split (":");
                String key = clip (keyValueParts[0]);
                String value = clip (keyValueParts[1]);

                if (key.equals("фамилия"))
                    name = value;
                else if (key.equals("оценка"))
                    grade = value;
                else if (key.equals("предмет"))
                    subject = value;
                else
                    throw new IllegalStateException("Непонятное поле");
            }
            System.out.printf("Студент %s получил %s по предмету %s. \n", name, grade, subject);
        }
    }
    
    private static String clip (String str)
    {
    return str.substring(1, str.length()-1);
    }
}