package chapter.third.p_c_allWait;

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
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
