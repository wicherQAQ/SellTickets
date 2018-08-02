package vip.wicher.code;

public class Test {

    public static void main(String[] args) {
        SellTicketThread s = new SellTicketThread();
        Thread t1 = new Thread(s,"windows1");
        Thread t2 = new Thread(s,"windows2");
        Thread t3 = new Thread(s,"windows3");
        t1.start();
        t2.start();
        t3.start();
    }
}
