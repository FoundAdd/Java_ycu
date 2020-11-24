package cn.hy.ch1;

/*
编写程序，提示用户输入两个点(x1, y1)和(x2, y2)，
然后显示两点间的距离，计算两点间距离的公式是sqrt((x2-x1)^2 + (y2-y1)^2)。
注意：可以使用Math.pow(a,0.5)来计算sqrt(a)。
 */

import java.util.Scanner;

public class Ch1Demo5 {
    public static void main(String[] args) {
        int x1,y1, x2,y2;
        double len;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入点1的坐标，以空格键隔开，以回车键结束：");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.println("请输入点2的坐标，以空格键隔开，以回车键结束：");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        len = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1), 2) );
        System.out.println("点1与点2之间的距离为：" + len);
    }
}
