package chapter.third.joinMoreTest;

/**
 * Created by songxiaowei on 2016/3/9.
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("begin B ThreadName=" + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("  end B ThreadName=" + Thread.currentThread().getName()
                     + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
