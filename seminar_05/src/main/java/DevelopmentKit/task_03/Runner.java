package DevelopmentKit.task_03;

import java.util.Random;

public class Runner {
    Random rnd = new Random();
    private boolean ready = false;
    private int distance = 0;

    public void setReady() {
        try {
            Thread.sleep(rnd.nextInt(100));
            this.ready = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isReady() {return ready;}

    public void run (int finish){
        try {
            while (distance != finish){
                Thread.sleep(rnd.nextInt(10));
                distance++;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public int getDistance() {
        return distance;
    }
}