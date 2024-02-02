package student_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentCode {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        //добовлять можно исключительно парой -
        // нельзя добавить только ключ или только значение
        countries.put("Germany", "Berlin");
        countries.put("Austrie", "Vien");
        countries.put("France", "Paris");
        countries.put("Great Britain", "London");

        // чтобы получить все ключи, мы можем воспользоваться методом keySet(),
        // который вернет set, содержащий ключи из мапы

        Set<String> keys = countries.keySet();

        for (String key : keys) {
            System.out.println(countries.get(key));
        }
    }
}
