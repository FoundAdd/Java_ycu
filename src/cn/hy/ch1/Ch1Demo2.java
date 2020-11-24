package cn.hy.ch1;

import java.util.Scanner;
/*
编写程序，输入两个整数，输出其和，差，积，商，整除的结果。
 */
public class Ch1Demo2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入两个数，每个数以回车或空格结束：");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "*" + b + "=" + (a*b));
        System.out.println(a + "/" + b + "=" + ((double)a/b));
        System.out.println(a + "%" + b + "=" + (a%b));
    }
}
