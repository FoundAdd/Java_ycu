package cn.hy.ch7;

import java.io.IOException;
import java.util.Scanner;

/*
编写一个计算N个学生平均分数的程序编写一个程序Ch7Demo3类，程序应该提示用户输入N的值 ，并输入相应的分数，
如果用户输入的一个负分数，则应该抛出一个异常并捕获，提示“分数必须是正数或者0”，并提示用户再次输入分数。
 */
public class Ch7Demo3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double[] scores;
        int students = 0;

        System.out.println("请输入要计算平均分的学生人数以及他们的分数：");
        students = sc.nextInt();
        if (students <= 0) {
            throw new Exception("学生人数必须大于0");
        }
        scores = new double[students];
        for (int i=0; i<students; i++){
            System.out.print("请输入学生" + i + "的分数： ");

            double temp = 0;
            temp = sc.nextDouble();

            if (temp < 0 || temp > 100) {
                System.err.println("成绩不能是负分数或大于100的分数");
                i--;
                continue;
            }
            scores[i] = temp;
        }
    }
}
