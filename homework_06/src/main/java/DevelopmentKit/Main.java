/*
В качестве домашнего задания студентам будет предложена задача реализовать Java приложение для демонстрации парадокса
Монти Холла (Парадокс Монти Холла — Википедия) и наглядно убедиться в верности парадокса (запустить игру в цикле на
1000 и вывести итоговый счет).
Студенту необходимо:
Создать свой Java Maven/Gradle проект;
Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
Можно добавить любые библиотеки которые считают необходимыми
Результаты должны быть сохранены в HashMap (шаг цикла -> результат)
Необходимо вывести статистику по результату - количество позитивных и негативных результатов, процент от общего
количества шагов цикла.
 */

package DevelopmentKit;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    static int doors = 3;
    static int quantity = 1000;

    public static void main(String[] args) {
        int winner = 0;
        int Loser = 0;
        for (int i = 0; i < processingGame().size(); i++) {
            if (processingGame().get(i + 1)) {
                winner++;
            } else {
                Loser++;
            }
        }
        System.out.println("Выигрышных комбинаций: " + winner + "\nПроигрышных комбинаций: " + Loser);

        double percentWinner = (double) (winner * 100) / quantity;
        double percentLoser = (double) (Loser * 100) / quantity;
        System.out.println("% выигрышных комбинаций: " + percentWinner + "\n% проигрышных комбинаций: " + percentLoser);
    }

    /**
     * @return коллекция результатов комбинаций
     */
    public static Map<Integer, Boolean> processingGame() {
        int counterIteration = 0;
        Map<Integer, Boolean> result = new HashMap<>();
        while (counterIteration < quantity) {
            int winningDoor = new Random().nextInt(doors) + 1;
            int selectedDoor = new Random().nextInt(doors) + 1;
            result.put(counterIteration + 1, resultGame(winningDoor, selectedDoor));
            counterIteration++;
        }
        return result;
    }

    /**
     * @param winningDoor  Дверь с выигрышем
     * @param selectedDoor Выбранная дверь
     * @return true если выбранная дверь оказалась выигрышной
     */
    public static boolean resultGame(int winningDoor, int selectedDoor) {
        int setNewDoor = new Random().nextInt(2); // Смена решения выбора: если 0 то не меняем, если 1 меняем
        if (winningDoor == selectedDoor) {
            return setNewDoor == 0;
        }
        return setNewDoor == 1;
    }
}