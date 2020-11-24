package cn.hy.ch2;

/*
编写程序，提示用户输入一个社保号码，它的格式是DDD-DD-DDDD,其中D是一个数字。
你的程序应该判断输入是否合法。
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ch2Demo7 {
    public static void main(String[] args) {
        if ( isRight() ) {
            System.out.println("输入格式正确，已保存");
            return;
        }
        System.out.println("输入不合法");
    }

    private static boolean isRight(){
        String number;
        String pattern = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入社保号码，格式为DDD-DD-DDDD：");
        number = sc.nextLine();

        System.out.println("输入的值为：" + number);
        return Pattern.matches(pattern, number);
    }
}
