//Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
//        Получите уникальный список Set на основании List
//        Определите наименьший элемент (алфавитный порядок)
//        Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
//        Удалите все элементы содержащие букву ‘A’

package DevelopmenKit.task_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Алексей");
        names.add("Иван");
        names.add("Анна");
        names.add("Анна");
        names.add("Евгений");
        names.add("Ирина");
        names.add("Ирина");
        names.add("Максим");
        names.add("Олег");
        names.add("Олег");

        Set<String> setStr = new HashSet<>(names);
        System.out.println(setStr);

        names.sort(String::compareTo);
        String name = names.get(0);
        System.out.println(name);

        List<String> namesList = new ArrayList<>();
        for (String n : names) {
            if (!n.contains("a")&&!n.contains("A")) {
                namesList.add(n);
            }
        }
        System.out.println(namesList);
    }
}

