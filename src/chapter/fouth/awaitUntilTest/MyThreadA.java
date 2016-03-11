package chapter.fouth.awaitUntilTest;

/**
 * Created by wuyan on 2016/3/11.
 */
public class MyThreadA extends Thread {
    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.waitMethod();
    }
}
