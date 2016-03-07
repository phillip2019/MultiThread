package chapter.second.synllockin_1;

/**
 * Created by wuyan on 2016/3/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}
