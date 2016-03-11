package chapter.fouth.awaitUntilTest;

/**
 * Created by wuyan on 2016/3/11.
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
