package chapter.second.synchronizedandnosynchronized;


/**
 * Created by wuyan on 2016/3/1.
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThreadA a = new MyThreadA(task);
        a.start();
        MyThreadB b = new MyThreadB(task);
        b.start();
    }
}
