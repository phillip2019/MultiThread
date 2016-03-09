package chapter.third.stack_4;

/**
 * Created by wuyan on 2016/3/9.
 */
public class PThread extends Thread {
    private P p;

    public PThread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            p.pushService();
        }
    }
}
