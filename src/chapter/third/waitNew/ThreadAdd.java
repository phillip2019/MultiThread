package chapter.third.waitNew;

/**
 * Created by wuyan on 2016/3/8.
 */
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        p.add();
    }
}
