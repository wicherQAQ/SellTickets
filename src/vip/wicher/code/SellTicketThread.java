package vip.wicher.code;

public class SellTicketThread implements Runnable{

    private static int num = 100;

    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(num>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"卖出了第"+num--+"章电影票");
                }
            }
        }
    }
}
