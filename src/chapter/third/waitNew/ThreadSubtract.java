package chapter.third.waitNew;

/**
 * Created by wuyan on 2016/3/8.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.subtract();
    }
}
