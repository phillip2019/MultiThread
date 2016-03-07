package chapter.third;

/**
 * Created by wuyan on 2016/3/5.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Ticket ticket = new Ticket(100);
            SellerTicket sellerTicket = new SellerTicket(ticket);
            Thread a = new Thread(sellerTicket, "A");
            a.start();
            Thread.sleep(250);
            Thread b = new Thread(sellerTicket, "B");
            b.start();
            Thread.sleep(250);
            Thread c = new Thread(sellerTicket, "C");
            c.start();
            Thread.sleep(250);
            Thread d = new Thread(sellerTicket, "D");
            d.start();
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("遇到异常，线程" + Thread.currentThread().getName() + "终止了!");
        }
    }
}
