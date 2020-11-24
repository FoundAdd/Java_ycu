package cn.hy.ch7;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
编写一个程序Ch7Demo1类，提示用户输入两个整数，然后显示它们的和，
程序应该在输入不正确时提示用户再次读取数字。
 */
public class Ch7Demo1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc;

        System.out.println("请输入两个数：");
        while (true) {
            try {
                sc = new Scanner(System.in);
                num1 = sc.nextInt();
                num2 = sc.nextInt();

                System.out.println("number1 + number2 = " + (num1 + num2));
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入不正确，请重新输入（仅支持整数）：");
                continue;
            }
        }
    }
}
