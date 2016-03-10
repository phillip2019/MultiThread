package chapter.fouth.UseConditionWaitNotifyError;

/**
 * Created by wuyan on 2016/3/10.
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
