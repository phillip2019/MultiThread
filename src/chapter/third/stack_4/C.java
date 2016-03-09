package chapter.third.stack_4;

/**
 * Created by wuyan on 2016/3/9.
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService(){
        System.out.println("pop=" + myStack.pop());
    }
}
