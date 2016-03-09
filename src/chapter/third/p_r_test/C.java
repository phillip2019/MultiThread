package chapter.third.p_r_test;

/**
 * Created by wuyan on 2016/3/9.
 */
public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                while(ValueObject.value.equals("")){
                    System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING了☆");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE");
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
