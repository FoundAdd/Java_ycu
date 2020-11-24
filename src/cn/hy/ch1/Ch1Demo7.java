package cn.hy.ch1;

/*
编写程序，定义一个布尔型变量，读入其值，若是真则输出1，否则输出0。
 */

import java.util.Scanner;

public class Ch1Demo7 {
    public static void main(String[] args) {
        boolean bool;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入True或者False：");
        bool = sc.nextBoolean();

        if (bool){
            System.out.println("1");
            return;
        }
        System.out.println("0");
    }
}
