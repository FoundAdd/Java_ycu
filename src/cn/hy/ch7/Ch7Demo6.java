package cn.hy.ch7;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
自定义异常类Ch7Demo6，程序接收用户输入的分数信息，
如果分数在0-100之间，输出成绩，
如果成绩不在这个范围内，则抛出异常信息，提示分数必须在0-100之间。
要求：使用自定义异常实现。
 */
public class Ch7Demo6 {

    public static void main(String args[]) throws Ch7Demo6Exception {
        Scanner sc = new Scanner(System.in);
        int score;

        score = sc.nextInt();
        if (score>=0 && score<=100){
            System.out.println(score);
        } else {
            throw new Ch7Demo6Exception("分数必须在0-100之间");
        }

    }
}

class Ch7Demo6Exception extends Exception {
    public Ch7Demo6Exception(){
        super();
    }

    public Ch7Demo6Exception(String message){
        super(message);
    }

    public Ch7Demo6Exception(String message, Throwable cause){
        super(message, cause);
    }

    public Ch7Demo6Exception(Throwable cause){
        super(cause);
    }
}