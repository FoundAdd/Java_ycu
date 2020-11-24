package cn.hy.ch7;

import java.io.File;
import java.util.Scanner;

/*
编写一个程序Ch7Demo7类，提示用户输入一个目录名称，然后使用File类中的mkdirs方法创建相应的目录，
如果目录创建成功则显示“目录创建成功”，
如果目录已经存在，则显示“目录已经存在，不需创建了”。
 */
public class Ch7Demo7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要创建的目录名称：");
        File file = new File(sc.next());

        if (file.mkdirs()){
            System.out.println("目录创建成功");
        } else {
            throw new Exception("目录已经存在，不需创建了");
        }
    }
}
