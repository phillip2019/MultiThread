package chapter.third.waitNew;

/**
 * Created by wuyan on 2016/3/8.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("substract1Thread");
        subtract1Thread.start();

        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("substract2Thread");
        subtract2Thread.start();

        Thread.sleep(1000);

        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();


    }
}
