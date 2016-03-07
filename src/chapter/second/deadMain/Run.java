package chapter.second.deadMain;

/**
 * Created by wuyan on 2016/3/4.
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        printStringService.printStringMethod();
        System.out.println("我停止它！ stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
