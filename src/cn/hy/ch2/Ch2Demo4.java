package cn.hy.ch2;

/*
编写程序实现按国家最新发布的个人所得税来计算，
输入一个人的工资，输出应该缴纳的税费是多少？
 */

import java.util.Scanner;

public class Ch2Demo4 {
    public static void main(String[] args) {
        int totalSalary;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年总工资:");
        totalSalary = sc.nextInt();
        salary(totalSalary);
    }

    private static void salary(int totalSalary){
        /*
         * 查询到的税率表有疑问，跳过
         */

        if (totalSalary < 36000){
            System.out.println("未达到个税起征点，收入为" + totalSalary + "元");
        }
        else if (totalSalary>36000 && totalSalary<144000){
            double tmp;
            tmp = 36000 + (totalSalary-36000) * 0.1;
            System.out.println("达到一档税率， 税后收入为" + tmp + "元");
        }
        else if (totalSalary>144000 && totalSalary<300000){
            double tmp;
            tmp = 36000 + (totalSalary);
        }
    }
}
