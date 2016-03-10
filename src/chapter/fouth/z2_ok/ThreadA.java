package chapter.fouth.z2_ok;

/**
 * Created by wuyan on 2016/3/10.
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.waitMethod();
    }
}
