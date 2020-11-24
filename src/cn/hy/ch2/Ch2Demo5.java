package cn.hy.ch2;

/*
编写程序，提示用户输入两个圆的中心坐标及各自的半径值，
然后决定第一个圆是在第一个圆内，还是和第一个圆相交了一部分，还是和第一个圆不相交。
提示：如果两个圆心的距离<=|r1-r2|，就认为第二个圆在第一个圆内，
如果两个圆心的距离<=r1+r2，相交，如果两个圆心的距离>=r1+r2，不相交。
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch2Demo5 {
    public static void main(String[] args) {
        int x1 = 0,
            y1 = 0,
            x2 = 0,
            y2 = 0;
        double len,
               radius1 = 0,
               radius2 = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("请输入点1的 x 坐标：");
            x1 = sc.nextInt();
            System.out.print("请输入点1的 y 坐标：");
            y1 = sc.nextInt();
            System.out.print("请输入点1的半径：");
            radius1 = sc.nextInt();
            System.out.print("请输入点2的 x 坐标：");
            x2 = sc.nextInt();
            System.out.print("请输入点2的 y 坐标：");
            y2 = sc.nextInt();
            System.out.print("请输入点2的半径：");
            radius2 = sc.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("输入了错误值");
        }
        len = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        if ((radius2 + radius1) >= len){
            if (Math.abs((radius2 - radius1)) >= len){
                //相套
                System.out.println("相套");
            }
            else {
                //相交
                System.out.println("相交");
            }
        }
        else {
            //不相交
            System.out.println("不相交");
        }

    }
}
