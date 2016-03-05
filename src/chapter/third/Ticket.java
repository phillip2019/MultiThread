package chapter.third;

/**
 * Created by wuyan on 2016/3/5.
 */
public class Ticket {
    private int ticketNum = 0;

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public Ticket(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public void sell(){
        ticketNum--;
    }
}
