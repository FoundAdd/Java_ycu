package cn.hy.ch2;

/*
编写程序，读入未指定个数的整数，判断读入的正数有多少个，读入的负数有多少个，
然后计算这些输入值的总和及其平均值，当输入0时结束，不对0计数。平均数以浮点数显示。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ch2Demo9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        getNumber(list);
        domain(list);
    }

    private static void getNumber(List<Integer> list){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int tmp;

        System.out.println("请输入一串整数，当输入0时结束：");
        while (true){
            tmp = sc.nextInt();
            if (tmp == 0){
                break;
            }
            else {
                list.add(tmp);
            }
        }
    }

    private static void domain(List<Integer> list){
        int positive = 0, negative = 0, listSum = 0;
        double listAve;
        for (Integer i : list){
            listSum += i;
            i = i>0 ? positive++ : negative++;
        }
        listAve = (double) listSum / list.size();

        System.out.println("输入的和为：" + listSum);
        System.out.println("一共有" + list.size() + "个元素");
        System.out.println("其中有" + positive + "个正整数， 有" + negative + "个负整数");
        System.out.println("所以平均数为：" + listAve);
    }
}
