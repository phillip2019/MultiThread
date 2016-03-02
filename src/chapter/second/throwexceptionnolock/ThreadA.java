package chapter.second.throwexceptionnolock;

/**
 * Created by wuyan on 2016/3/1.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
