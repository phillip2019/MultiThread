package chapter.second.synTwoLock;

/**
 * Created by wuyan on 2016/3/3.
 */
public class ThreadC extends Thread{
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}
