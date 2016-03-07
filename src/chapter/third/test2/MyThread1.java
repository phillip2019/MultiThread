package chapter.third.test2;

/**
 * Created by wuyan on 2016/3/7.
 */
public class MyThread1 extends Thread{
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        try {
            synchronized (lock) {
                System.out.println("开始      wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束      wait time=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
