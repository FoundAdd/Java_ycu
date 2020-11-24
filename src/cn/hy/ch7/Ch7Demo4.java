package cn.hy.ch7;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
编写一个程序Ch7Demo4类，如果名为a.txt的文件不存在，则创建该文件。
使用文本I/O将随机产生的100整数写入文件，文件中的整数由空格分开。
从文件中读回数据并以降序显示数据。
 */
public class Ch7Demo4 {
    @Test
    public void test() throws IOException {
        File file = new File("a.txt");
        int[] randomNum = new int[100];
        int[] result;

        for (int i=0; i<randomNum.length; i++){
            Random random = new Random();
            randomNum[i] = random.nextInt(100);
        }

        write(file, randomNum);
        result = read(file);

        result = sort(result);

        for (int i : result){
            System.out.println(i);
        }
    }

    public void write(File file, int[] randomNum) throws IOException{
        FileWriter fileOutputStream;

        try {
            fileOutputStream = new FileWriter(file);
        } catch (IOException e) {
            file.createNewFile();
            fileOutputStream = new FileWriter(file);
        }

        for (int i=0; i<randomNum.length; i++) {
            fileOutputStream.write(String.valueOf(randomNum[i]));
            fileOutputStream.write(" ");
        }
        fileOutputStream.close();
    }

    public int[] read(File file) throws IOException {
        Scanner sc = new Scanner(file);
        int[] result = new int[100];

        for (int i=0; i<result.length; i++) {
            result[i] = Integer.parseInt(sc.next());
        }

        return result;
    }

    public int[] sort(int[] data) {
        int[] reData = new int[100];
        int j = 0;
        Arrays.sort(data);

        for (int i=data.length; i>0; ){
            reData[j++] = data[--i];
        }

        return reData;
    }
}
