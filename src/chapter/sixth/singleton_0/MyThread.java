package chapter.sixth.singleton_0;

/**
 * Created by songxiaowei on 2016/3/13.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(MyObject.getInstance().hashCode());
    }
}
