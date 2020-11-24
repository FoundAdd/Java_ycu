package cn.hy.ch1;

/*
编写程序，读入两个字符串，输出两个字符串相联的结果。
 */

import java.util.Scanner;

public class Ch1Demo8 {
    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要拼接的字符串，以回车隔开：");
        str1 = sc.nextLine();
        str2 = sc.nextLine();

        System.out.println(str1 + " " + str2);
    }
}
