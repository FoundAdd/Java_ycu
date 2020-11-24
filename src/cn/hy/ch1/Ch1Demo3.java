package cn.hy.ch1;

/*
编写程序，读入磅数，将其转换为千克数，并输出其结果。一磅等于0.454千克。
 */

import java.util.Scanner;

public class Ch1Demo3 {
    public static void main(String[] args) {
        double bond;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入磅数，以回车键结束：");
        bond = sc.nextDouble();

        System.out.println(bond + "磅约等于" + (bond * 0.454) + "千克");
    }
}
