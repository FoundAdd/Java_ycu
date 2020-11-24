package cn.hy.ch1;

/*
编写程序，输入三角形的三条边，判断是否能构成三角形，
若能，输出其周长及面积。
面积计算，三条边a、b、c, p = (a+b+c)/2,则面积s = sqrt(p*(p-a)*(p-b)*(p-c))。
 */

import java.util.Scanner;

public class Ch1Demo9 {
    public static void main(String[] args) {
        double a, b, c, area, temp;
        boolean isTrilateral = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入三角形的三条边：");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a+b > c){
            if (a+c > b){
                if (b+c > a){
                    isTrilateral = true;
                }
            }
        }

        if (!isTrilateral){
            System.out.println("参数错误，不能构成三角形");
            return;
        }

        temp = (a+b+c)/2;
        area = Math.sqrt(temp * (temp-a) * (temp-b) * (temp-c));

        System.out.println("该三角形面积是：" + area);
    }
}
