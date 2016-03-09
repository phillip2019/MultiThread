package chapter.third.stack_4;

/**
 * Created by wuyan on 2016/3/9.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        PThread pThread1 = new PThread(p1);
        PThread pThread2 = new PThread(p2);
        PThread pThread3 = new PThread(p3);
        PThread pThread4 = new PThread(p4);
        PThread pThread5 = new PThread(p5);
        PThread pThread6 = new PThread(p6);
        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();
        pThread6.start();

        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);
        C r6 = new C(myStack);
        C r7 = new C(myStack);
        C r8 = new C(myStack);

        CThread cThread1 = new CThread(r1);
        CThread cThread2 = new CThread(r2);
        CThread cThread3 = new CThread(r3);
        CThread cThread4 = new CThread(r4);
        CThread cThread5 = new CThread(r5);
        CThread cThread6 = new CThread(r6);
        CThread cThread7 = new CThread(r7);
        CThread cThread8 = new CThread(r8);

        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
        cThread6.start();
        cThread7.start();
        cThread8.start();
    }
}
