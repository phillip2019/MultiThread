package chapter.third.test2;

/**
 * Created by wuyan on 2016/3/7.
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            System.out.println("开始notify time=" + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify time=" + System.currentTimeMillis());
        }
    }
}
