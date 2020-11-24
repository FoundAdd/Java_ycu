package cn.hy.ch2;

/*
编写可以玩流行的“剪刀－石头－布”游戏的程序，程序提示用户随机产生一个数，
这个数为0，1，2，分别表示石头、剪刀和布。
程序提示用户输入0、1、2，然后显示一条信息，表明用户和计算机谁赢了游戏，谁输了游戏，或是打了平手。
（如果考虑人或机器3盘两胜呢）
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch2Demo2 {
    public static void main(String[] args) {
        int result;
        int gameTimes;
        int userWinSum = 0;
        int programWinSum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入游戏局数： ");
        gameTimes = sc.nextInt();

        while (gameTimes > 0) {
            result = games();
            if (result == 0) {
                userWinSum++;
            }
            else if (result == 1) {
                programWinSum++;
            }
            gameTimes--;
        }

        System.out.println("用户胜利次数：" + userWinSum + "\n计算机胜利次数：" + programWinSum);
        if (userWinSum > programWinSum){
            System.out.println("综上，用户胜");
        }
        else if (userWinSum < programWinSum){
            System.out.println("综上，计算机获胜");
        }
        else {
            System.out.println("综上，用户与计算机平手");
        }
    }

    public static int games(){
        int user = -1;
        int program;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入石头（0）、剪刀（1）或布（2）的任意一种（输入括号中的数字）: ");
        try {
            user = sc.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("仅可输入数字");
        }
        program = (int)Math.floor(Math.random() * 3);

        if ((user==0 && program== 1) || (user==1 && program== 2) ||(user==2 && program== 0)){
            System.out.println("用户获胜");
            return 0;
        }
        else if (user == program){
            System.out.println("打平");
        }
        else {
            System.out.println("计算机获胜");
            return 1;
        }

        return -1;
    }
}
