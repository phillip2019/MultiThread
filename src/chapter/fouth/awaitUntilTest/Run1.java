package chapter.fouth.awaitUntilTest;

/**
 * Created by wuyan on 2016/3/11.
 */
public class Run1 {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }
}
