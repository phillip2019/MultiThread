package chapter.third.waitOld;



/**
 * Created by wuyan on 2016/3/8.
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
