package chapter.third.p_c_callWait_fix;

/**
 * Created by wuyan on 2016/3/9.
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while(true){
            p.setValue();
        }
    }
}
