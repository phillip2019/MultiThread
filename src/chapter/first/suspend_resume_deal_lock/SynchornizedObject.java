package chapter.first.suspend_resume_deal_lock;

/**
 * Created by wuyan on 2016/2/29.
 */
public class SynchornizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了!");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
