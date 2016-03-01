package chapter.first.daemon;

/**
 * Created by wuyan on 2016/3/1.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开了thread对象也不再打印了，也就是停止了!");
            while (true){
                System.out.println("a");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
