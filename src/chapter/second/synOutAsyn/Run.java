package chapter.second.synOutAsyn;

/**
 * Created by wuyan on 2016/3/3.
 */
public class Run {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(myList);
        b.setName("B");
        b.start();
    }
}
