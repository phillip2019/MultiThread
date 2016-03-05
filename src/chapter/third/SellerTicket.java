package chapter.third;

/**
 * Created by wuyan on 2016/3/5.
 */
public class SellerTicket implements Runnable {
    private Ticket ticket;

    public SellerTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 25; i++) {
                synchronized (ticket) {
                    ticket.sell();
                    System.out.println("线程" + Thread.currentThread().getName() +
                            "卖出了一张票,还剩" + ticket.getTicketNum() + "张票。");
                }
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("遇到异常，线程" + Thread.currentThread().getName() + "终止了!");
        }
    }
}
