package chapter.second.synBlockString;

/**
 * Created by wuyan on 2016/3/2.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.setUsernamePassword("b", "bb");
    }
}
