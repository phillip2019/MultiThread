package chapter.second.synchronizedandnosynchronized;

/**
 * Created by wuyan on 2016/3/1.
 */
public class MyThreadB extends Thread {
    private Task task;
    public MyThreadB(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
