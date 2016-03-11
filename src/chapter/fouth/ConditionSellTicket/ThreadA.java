package chapter.fouth.ConditionSellTicket;

/**
 * Created by songxiaowei on 2016/3/11.
 */
public class ThreadA extends Thread {

    private SellerTicket seller;

    public ThreadA(SellerTicket seller) {
        this.seller = seller;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 25; i++) {
            seller.aSell();
        }
    }
}
