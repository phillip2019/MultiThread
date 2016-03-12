package chapter.fouth.ConditionSellTicket;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wuyan on 2016/3/5.
 */
public class SellerTicket{

    volatile public static int nextThread = 1;      //1:A, 2:B, 3:C, 4D
    private Ticket ticket;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public SellerTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void aSell(){
        try {
            lock.lock();
            while (F.nextThread != 1) {
//                System.out.println("A nextThread=" + F.nextThread);
                condition.await();
            }
            ticket.sell();
            System.out.println("Thread " + Thread.currentThread().getName() + ":" + ticket.getTicketNum());
            F.nextThread = 2;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void bSell(){
        try {
            lock.lock();
            while (F.nextThread != 2) {
//                System.out.println("B nextThread=" + F.nextThread);
                condition.await();
            }
            ticket.sell();
            System.out.println("Thread " + Thread.currentThread().getName() + ":" + ticket.getTicketNum());
            F.nextThread = 3;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void cSell(){
        try {
            lock.lock();
            while (F.nextThread != 3) {
//                System.out.println("C nextThread=" + F.nextThread);
                condition.await();
            }
            ticket.sell();
            System.out.println("Thread " + Thread.currentThread().getName() + ":" + ticket.getTicketNum());
            F.nextThread = 4;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void dSell(){
        try {
            lock.lock();
            while (F.nextThread != 4) {
//                System.out.println("D nextThread=" + F.nextThread);
                condition.await();
            }
            ticket.sell();
            System.out.println("Thread " + Thread.currentThread().getName() + ":" + ticket.getTicketNum());
            F.nextThread = 1;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
