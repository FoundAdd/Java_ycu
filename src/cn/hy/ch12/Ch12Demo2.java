package cn.hy.ch12;


import java.util.Date;

/**
 * 输出两个线程的优先级，将第二个线程的优先级设置为8，
 * 将第二个线程让一让，并将上面两个线程合并，并将输出10行后的“我是主线程”等待2秒后唤醒。
 * 输出当前系统时间的线程在1000次后终止。
 */
public class Ch12Demo2 extends Ch12Demo1{
    public volatile boolean isLive = true;
    @Override
    public void run() {

        int i = 0;
        System.out.println("第二线程当前优先级为：" + getPriority());
        // 设置线程优先级为8
        setPriority(8);
        while (isLive) {
            i++;
            if (i > 1000) {
                isLive = false;
            }
            System.out.println(sdf.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Ch12Demo2 thread = new Ch12Demo2();
        int i=0;

        thread.start();

        System.out.println("主线程当前优先级为：" + thread.getPriority());
        while (i++ >= 0) {
            System.out.println("我是主线程 " + i);
            if (i > 10) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
