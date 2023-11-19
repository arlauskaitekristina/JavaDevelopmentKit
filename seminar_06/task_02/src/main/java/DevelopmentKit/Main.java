/*
Создать свой Java Gradle проект;
Добавить зависимость Guava (популярная библиотека от Google, содержащая набор
утилитарных механизмов).
Воспользоваться утилитарным классом Lists:
Развернуть список элементов
Получить лист Character из строки
Разделить лист на группы по 2 элемента
Воспользоваться утилитарным классом Sets
Получить итоговый Set из двух коллекций
Получить итоговый Set из общих элементов двух коллекций
Получить итоговый Set из непересекающихся элементов двух коллекций

 */

package DevelopmentKit;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(Lists.charactersOf("Hello world!"));
        ImmutableList<Character> myList = Lists.charactersOf("Hello world!");
        for (int i = 0; i < myList.size() - 2; i = i + 2) {
            System.out.println(myList.subList(i, i + 2));
        }
        System.out.println(Lists.partition(Lists.charactersOf("Hello world!"), 2));
        System.out.println(Sets.union(Set.of(1,2,3,4), Set.of(3,4,5,6)));
        System.out.println(Sets.intersection(Set.of(1,2,3,4), Set.of(3,4,5,6)));
        System.out.println(Sets.difference(Set.of(1,2,3,4), Set.of(3,4,5,6)));


    }
}