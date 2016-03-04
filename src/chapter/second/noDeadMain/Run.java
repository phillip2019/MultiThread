package chapter.second.noDeadMain;

/**
 * Created by wuyan on 2016/3/4.
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        printStringService.printStringMethod();
        System.out.println("我停止它！ stopThread=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
