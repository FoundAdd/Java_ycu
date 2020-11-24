package cn.hy.ch1;

/*
编写程序，使用以下公式计算输入圆的半径，输出圆的面积及周长。
周长 = 2 * 半径 * π
面积 = 半径 * 半径 * π
 */

import java.util.Scanner;

public class Ch1Demo4 {
    public static void main(String[] args) {
        double radius;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要计算的圆的半径，以回车键结束：");
        radius = sc.nextDouble();

        System.out.println("圆的周长为：" + (2 * radius * Math.PI));
        System.out.println("圆的面积为：" + (radius * radius * Math.PI));
    }
}
