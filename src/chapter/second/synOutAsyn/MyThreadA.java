package chapter.second.synOutAsyn;

/**
 * Created by wuyan on 2016/3/3.
 */
public class MyThreadA extends Thread {
    private MyList list;

    public MyThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 100; i++){
            list.add("threadA" + (i + 1));
        }
    }
}
