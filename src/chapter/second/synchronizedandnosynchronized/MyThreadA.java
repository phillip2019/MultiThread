package chapter.second.synchronizedandnosynchronized;

/**
 * Created by wuyan on 2016/3/1.
 */
public class MyThreadA extends Thread {
    private Task task;

    public MyThreadA(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
