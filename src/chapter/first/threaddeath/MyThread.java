package chapter.first.threaddeath;

/**
 * Created by wuyan on 2016/2/29.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        try{
            //对锁定的对象进行了解锁，导致数据得不到同步的处理，导致数据得不到同步的处理
            this.stop();
        }catch (ThreadDeath e){
            System.out.println("进入了catch()方法! ");
            e.printStackTrace();
        }
    }
}
