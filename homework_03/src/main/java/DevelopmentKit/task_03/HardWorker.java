package DevelopmentKit.task_03;

public class HardWorker implements Person{
    @Override
    public void doWork() {
        System.out.println("Working hard!");
    }

    @Override
    public void haveRest() {
        System.out.println("Can`t stop work!");
    }
}
