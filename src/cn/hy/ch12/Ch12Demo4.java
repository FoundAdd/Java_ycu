package cn.hy.ch12;


/**
 * 编程实现一个食堂生产者馒头和消费馒头问题，
 * 不会出现消费者买不到馒头，也不会出现满仓现象（用数组模似仓库）。
 */
public class Ch12Demo4 implements Runnable{
    public static volatile int[] cakes = new int[100];
    public static volatile int index = 0;
    public volatile boolean isLive = true;

    public static void main(String[] args) {
        Runnable runnable = new Ch12Demo4();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.setName("+");  //生产馒头
        t2.setName("-");  //消费馒头

        //初始化仓库库存
        while (index < cakes.length-1) {
            cakes[index++] = 1;
        }
        System.out.println("生产了100个馒头，当前馒头剩余100个");

        t1.start();
        t2.start();
    }
    @Override
    public void run() {
        while (isLive) {
            synchronized ("start") {
                String currentHandle = Thread.currentThread().getName();
                if (currentHandle.equals("+")){
                    //生产（每次生产100个馒头）
                    if (cakes[1] == 0) {
                        addCake(100);
                        index = 99;
                    }
                } else if (currentHandle.equals("-")) {
                    //消费
                    if (cakes[1] == 0) {
                        //没有馒头库存了，阻塞该线程等待生产
                        Thread.yield();
                    }else {
                        minusCake();
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public void addCake(int number) {
        for (int i=1; i<number; i++) {
            cakes[i] = 1;
        }
        index += number;
        System.out.println("生产了" + (number-1) + "个馒头，当前馒头剩余" + number + "个");
    }

    public void minusCake() {
        cakes[index--] = 0;
        System.out.println("售出了1个馒头，当前馒头剩余" + (index+1) + "个");
    }
}
