package chapter.first.suspend_resume_lockstop;

/**
 * Created by wuyan on 2016/2/29.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
