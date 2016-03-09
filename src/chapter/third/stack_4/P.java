package chapter.third.stack_4;

/**
 * Created by wuyan on 2016/3/9.
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
