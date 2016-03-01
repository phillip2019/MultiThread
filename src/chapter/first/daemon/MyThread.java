package chapter.first.daemon;

/**
 * Created by wuyan on 2016/3/1.
 */
public class MyThread extends Thread {
    private int i = 0;
    @Override
    public void run() {
        super.run();
        try{
            while(true) {
                i++;
                System.out.println("i=" + (i));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
