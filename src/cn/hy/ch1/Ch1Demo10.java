package cn.hy.ch1;

/*
编写程序，计算100的累加。
 */

public class Ch1Demo10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum = sum + i;
        }

        System.out.println("100累加值为：" + sum);
    }
}
