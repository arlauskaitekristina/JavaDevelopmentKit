//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//        sum(), multiply(), divide(), subtract(). Параметры этих методов – два
//        числа разного типа, над которыми должна быть произведена операция.

package DevelopmentKit.task_04;

public class Main {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        int intNum1 = 2;
//        long longNum2 = 4;
//
//        double doubleNum1 = 7.5;
//        float floatNum2 = 2.5F;
//
//
//        System.out.println("Сумма: " + calculator.sum(intNum1, longNum2));
//        System.out.println("Умножение: " + calculator.multiply(doubleNum1, floatNum2));
//        System.out.println("Деление: " + calculator.divide(doubleNum1, floatNum2));
//        System.out.println("Вычитание: " + calculator.subtract(intNum1, longNum2));
//        System.out.println("Вычитание: " + calculator.subtract(longNum2, floatNum2));
//    }

//    Напишите обобщенный метод compareArrays(), который принимает два массива и
//    возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
//    любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
//    типа.

    public static void main(String[] args) {
        String[] array1 = {"a", "3", "h"};
        String[] array2 = {"a", "h", "h"};
        String[] array3 = {"1", "2", "h"};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
    }
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
}
