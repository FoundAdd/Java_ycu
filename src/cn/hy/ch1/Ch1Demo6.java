package cn.hy.ch1;

/*
编写程序，输入一个小写字母，输出其大写字母。
 */

import java.util.Scanner;

public class Ch1Demo6 {
    public static void main(String[] args) {
        char low;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要转换的小写字母：");
        low = sc.next().charAt(0);

        System.out.println(low + "的大写为" + (char) (low - 32));
    }
}
