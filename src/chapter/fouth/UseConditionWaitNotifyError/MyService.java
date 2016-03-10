package chapter.fouth.UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wuyan on 2016/3/10.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try{
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
