package chapter.fouth.ConditionSellTicket;

/**
 * Created by wuyan on 2016/3/5.
 */
public class Run {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(100);
        SellerTicket seller = new SellerTicket(ticket);
        ThreadA threadA = new ThreadA(seller);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(seller);
        threadB.setName("B");
        ThreadC threadC = new ThreadC(seller);
        threadC.setName("C");
        ThreadD threadD = new ThreadD(seller);
        threadD.setName("D");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
