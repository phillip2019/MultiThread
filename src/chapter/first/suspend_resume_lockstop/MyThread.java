package chapter.first.suspend_resume_lockstop;

/**
 * Created by wuyan on 2016/2/29.
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        super.run();
       while(true){
           i++;
           System.out.println(i);
       }
    }
}
