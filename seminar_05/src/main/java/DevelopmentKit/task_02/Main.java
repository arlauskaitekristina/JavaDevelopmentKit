//

package DevelopmentKit.task_02;

public class Main {
    private static boolean switcher = true;

    private static int count = 100;

    public static void main(String[] args) {
        Runnable run1 = () -> {
            try {
                while (count > 0) {
                    switcher = !switcher;
                    Thread.sleep(1000);
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable run2 = () -> {
            try {
                while (count > 0) {
                    if (switcher) {
                        count--;
                        System.out.println(count);
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();
    }
}
