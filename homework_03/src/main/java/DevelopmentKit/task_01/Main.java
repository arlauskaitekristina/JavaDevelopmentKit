//Создать обобщенный класс с тремя параметрами (T, V, K). ++ Класс содержит три переменные типа (T, V, K), ++ конструктор,
//        принимающий на вход параметры типа (T, V, K), методы ++ возвращающие значения трех переменных. Создать метод,
//        выводящий на консоль имена ++ классов для трех переменных класса. ++ Наложить ограничения на параметры типа:
//        ++ T должен реализовать интерфейс Comparable (классы оболочки, String), ++ V должен реализовать интерфейс DataInput
//        и расширять класс InputStream, ++ K должен расширять класс Number

package DevelopmentKit.task_01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new DataInputStream(new
                FileInputStream("C:\\Users\\New\\Desktop\\VS_Code\\JavaDevelopmentKit\\homework_03\\src\\main\\java\\DevelopmentKit\\task_01\\test.txt"));
        FirstClass<String, DataInputStream, Integer> fc = new FirstClass<>("any",
                new DataInputStream(is), 1);

        fc.getNamesClass();
    }
}