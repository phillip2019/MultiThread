package chapter.third.stack_4;

/**
 * Created by wuyan on 2016/3/9.
 */
public class CThread extends Thread {
    private C r;

    public CThread(C r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        while (true){
            r.pushService();
        }
    }
}
