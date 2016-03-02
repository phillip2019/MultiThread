package chapter.second.throwexceptionnolock;

/**
 * Created by wuyan on 2016/3/1.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("a");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("b");
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
