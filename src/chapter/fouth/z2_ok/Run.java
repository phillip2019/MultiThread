package chapter.fouth.z2_ok;

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
