package DevelopmentKit.task_03;

public class Idle implements Person{
    @Override
    public void doWork() {
        System.out.println("Can`t work!");
    }

    @Override
    public void haveRest() {
        System.out.println("Party hard!");
    }
}