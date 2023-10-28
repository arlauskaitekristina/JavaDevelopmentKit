//Есть пять философов (потоки), которые могут либо обедать либо размышлять.
//        Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
//        После каждого приема пищи философ должен размышлять
//        Не должно возникнуть общей блокировки
//        Философы не должны есть больше одного раза подряд

package DevelopmentKit;

public class Main {
    public static void main(String[] args) {
            Philosopher philosopher1 = new Philosopher("philosopher1");
            Philosopher philosopher2 = new Philosopher("philosopher2");
            Philosopher philosopher3 = new Philosopher("philosopher3");
            Philosopher philosopher4 = new Philosopher("philosopher4");
            Philosopher philosopher5 = new Philosopher("philosopher5");

        Process  philosophers = new Process (philosopher1, philosopher2, philosopher3,
                    philosopher4, philosopher5);

            philosophers.setThreads();
        }
}