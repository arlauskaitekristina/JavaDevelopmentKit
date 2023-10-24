//Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
//Найдите человека с самым маленьким номером телефона
//Найдите номер телефона человека чье имя самое большое в алфавитном порядке

package DevelopmenKit.task_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("1234", "User1");
        phoneBook.put("1235", "User2");
        phoneBook.put("1236", "User3");
        phoneBook.put("1237", "Aser4");
        phoneBook.put("1238", "User5");
        phoneBook.put("1239", "User6");
        phoneBook.put("1233", "User7");
        int numMax = 0;

        for (String s : phoneBook.keySet()) {
            if (Integer.parseInt(s) > numMax)
                numMax = Integer.parseInt(s);
        }
        System.out.println(numMax);

        List<Map.Entry<String, String>> value = new ArrayList<>(phoneBook.entrySet());
        value.sort(Map.Entry.comparingByValue());
        System.out.println(value);
    }
}


