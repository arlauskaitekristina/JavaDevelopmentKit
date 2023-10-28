//Создать два класс ObjectA, ObjectB
//        Реализовать класс в котором два потока вызовут DeadLock

package DevelopmentKit.task_01;

public class ThreadDeadlock {
    public static void main(String[] args)  {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncThread(obj2, obj1), "t2");

        t1.start();
        t2.start();
    }
}
class SyncThread implements Runnable{
    private Object obj1;
    private Object obj2;
    public SyncThread(Object o1, Object o2){
        this.obj1=o1;
        this.obj2=o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        synchronized (obj1) {
            System.out.println(name);
            System.out.println(obj1);
            work();
            System.out.println(name);
            synchronized (obj2) {
                System.out.println(obj2);
                System.out.println(name);
                work();
            }
            System.out.println(name);
        }
        System.out.println(name);
    }
    private void work() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
