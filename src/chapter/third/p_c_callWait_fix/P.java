package chapter.third.p_c_callWait_fix;

/**
 * Created by wuyan on 2016/3/9.
 */
public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                if( !ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是" + value);
                ValueObject.value = value;
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
