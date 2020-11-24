package cn.hy.ch2;

/*
编写程序，输入一个年份及月份，输出这个月有多少天。
 */

import java.util.Scanner;

public class Ch2Demo3 {
    public static void main(String[] args) {
        daySum1();
        daySum2();
    }

    private static void daySum1(){
        int year, month;
        boolean isLeapYear; //是否闰年
        boolean isFebruary; //是否二月
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年份: ");
        year = sc.nextInt();
        System.out.print("请输入月份: ");
        month = sc.nextInt();

        isLeapYear = year%4 == 0;
        isFebruary = month == 2;

        if (!isFebruary) {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("本月有30天");
            } else {
                System.out.println("本月有31天");
            }
        }
        else if (!isLeapYear){
            System.out.println("本月有28天");
        }
        else{
            System.out.println("本月有29天");
        }
    }

    private static void daySum2(){
        int year;
        int month;
        int[] yearDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeapYear;
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年份: ");
        year = sc.nextInt();
        System.out.print("请输入月份: ");
        month = sc.nextInt();

        isLeapYear = year%4 == 0;
        yearDays[1] = isLeapYear ? 29 : 28;

        System.out.println("本月有" + yearDays[month-1] + "天");
    }
}
