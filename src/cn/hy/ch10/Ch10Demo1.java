package cn.hy.ch10;


/**
 * 编写一个程序Ch10Demo1类，
 * 输出处理器数量、空闲内存数、总内存数，可用最大内存数（Runtime类）。
 */
public class Ch10Demo1 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("处理器数量为：" + runtime.availableProcessors());
        System.out.println("空闲内存数：" + runtime.freeMemory());
        System.out.println("总内存数：" + runtime.totalMemory());
        System.out.println("可用最大内存数：" + runtime.maxMemory());
    }
}
