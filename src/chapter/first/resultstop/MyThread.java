package chapter.first.resultstop;

/**
 * Created by wuyan on 2016/2/29.
 */
public class MyThread extends Thread {
    private SynchronizedObject object;
    public MyThread(SynchronizedObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.printString("b", "bb");
    }
}
