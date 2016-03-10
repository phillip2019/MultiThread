package chapter.fouth.UseConditionWaitNotifyError;

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
        service.await();
    }
}
