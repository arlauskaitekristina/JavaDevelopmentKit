package DevelopmenKit.task_01;

//Создайте коллекцию мужских и женских имен с помощью интерфейса List
//        Отсортируйте коллекцию в алфавитном порядке
//        Отсортируйте коллекцию по количеству букв в слове Разверните коллекцию

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Алексей");
        names.add("Иван");
        names.add("Анна");
        names.add("Дмитрий");
        names.add("Евгений");
        names.add("Ирина");
        names.add("Ольга");
        names.add("Максим");
        names.sort(String::compareTo);
        System.out.println(names);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()<o2.length())
                    return 1;
                else if (o2.length()<o1.length())
                    return -1;
                return 0;
            }
        };
        names.sort(comparator);
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
