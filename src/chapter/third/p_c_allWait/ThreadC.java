package chapter.third.p_c_allWait;

/**
 * Created by wuyan on 2016/3/9.
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            c.getValue();
        }
    }
}
