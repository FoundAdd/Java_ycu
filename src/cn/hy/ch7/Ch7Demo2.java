package cn.hy.ch7;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
编写一个程序Ch7Demo2类，创建一个由100个随机选取的整数构成的数组，
提示用户输入数组的下标，然后显示对应的元素值，如果指定的下标越界，就显示消息“Out of Bounds”。
 */
public class Ch7Demo2 {
    public static void main(String[] args) {
        int[] iArray = new int[100];
        int index;
        Scanner sc;

        for (int i=0; i<iArray.length; i++){
            iArray[i] = (int)Math.floor(Math.random()*100);
        }

        System.out.println("请输入要查找的数组下标：");
        while (true) {
            sc = new Scanner(System.in);
            try {
                index = sc.nextInt();

                if (index < 0){
                    throw new InputMismatchException("仅允许正整数");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("仅允许正整数");
                continue;
            }
        }

        try {
            System.out.println(iArray[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
            return;
        }
    }
}
