package cn.hy.ch12;


/**
 * 设计一个多线程的程序――火车售票模拟程序，有100张票需要卖出，
 * 现在有5个售票点同时售票，用5个线程来模拟出售票情况。
 */
class testCh12Demo3 {
    public static void main(String[] args) {
        Runnable runnable = new Ch12Demo3();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(runnable);
        Thread t5 = new Thread(runnable);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t4.setName("窗口4");
        t5.setName("窗口5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

public class Ch12Demo3 implements Runnable{
    public volatile  boolean  isLive = true;
    public static volatile int tickets = 100;
    public static String str = new String("start");

    @Override
    public void run() {
        while (isLive) {
            synchronized(str) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在售票，当前剩余车票" + tickets + "张。");
                    tickets--;
                } else {
                    isLive = false;
                }
            }
        }
    }
}
