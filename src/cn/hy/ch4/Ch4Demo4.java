package cn.hy.ch4;

import cn.hy.ch3.Ch3Demo5;

import java.util.Scanner;

/*
第三次作业第5题中创建的（银行帐户）Ch4Demo5类来模仿一台ATM机。
创建一个有10个帐户的数组，其id为0,1,2,…9，初始化收支为100美元，
系统提示用户输入一个id。如果id输入不正确，就要求用户输入正确的id。
一旦接受一个id，就显示一个菜单。可以用1来查看当前的收支，用2来表示取钱，用3来表示存钱，用4表示退出主菜单。
一旦退出，系统就会提示再次输入id。
所以系统一旦启动就不会停止。
 */
public class Ch4Demo4 {
    public static void main(String[] args) {
        int status = 0;
        Ch3Demo5[] c3d5 = new Ch3Demo5[10];

        for (int i=0; i<c3d5.length; i++){
            c3d5[i] = new Ch3Demo5(i, 100);
        }

        while (status != -1) {
            int optStatus = 0;
            int id;
            int option;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a ID:");
            try {
                id = sc.nextInt();
                if (id<0 || id>c3d5.length-1){
                    System.out.println("Error input!(0-" + (c3d5.length-1) + ")");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Error ID !(Data of type int only)");
                continue;
            }
            System.out.println();
            while (optStatus != -1) {
                System.out.println("What do you want to do ?");
                System.out.println("1 is query, 2 is draw money, 3 is save money, 4 is return main menu");
                try {
                    option = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Error input");
                    continue;
                }
                if (option == 1){
                    System.out.println("The balance of your current account is $" + c3d5[id].getBalance() + " !");
                }
                else if(option == 2){
                    System.out.println("How much do you want to withdraw ?");
                    try {
                        c3d5[id].withDraw(sc.nextDouble());
                    }
                    catch (Exception e){
                        System.out.println("Error Input!");
                        continue;
                    }
                }
                else if(option == 3){
                    System.out.println("How much would you like to deposit ?");
                    try {
                        c3d5[id].deposit(sc.nextDouble());
                    } catch (Exception e) {
                        System.out.println("Error Input!");
                        continue;
                    }
                }
                else if(option == 4){
                    optStatus = -1;
                }
                else{
                    System.out.println("Error input");
                    continue;
                }
            }
        }
    }
}
