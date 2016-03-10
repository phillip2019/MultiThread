package chapter.fouth.Fair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by songxiaowei on 2016/3/10.
 */
public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "获得了锁定");
        }finally {
            lock.unlock();
        }
    }
}
