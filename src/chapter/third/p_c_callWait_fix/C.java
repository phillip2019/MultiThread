package chapter.third.p_c_callWait_fix;

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
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值是:" + ValueObject.value);
                ValueObject.value = "";
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
