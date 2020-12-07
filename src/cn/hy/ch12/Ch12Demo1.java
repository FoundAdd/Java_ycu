package cn.hy.ch12;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 主线程每隔1秒钟输出“我是主线程”，
 * 在主线程中同时启用另一个线程，输出每隔1秒的当前系统时间。（两种方法）
 */
public class Ch12Demo1 extends Thread{
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
    @Override
    public void run() {
        while (true) {
            System.out.println(sdf.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Ch12Demo1 thread = new Ch12Demo1();
        int i=0;

        thread.start();

        while (true) {
            System.out.println("我是主线程 " + i++);
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
