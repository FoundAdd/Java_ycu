package cn.hy.ch1;

/*
可以使用以下公式计算pi的值：π=4*（1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...），
编写程序，显示π=4*（1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11）
和π=4*（1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13）的结果。
在程序中用1.0代替1。
 */

public class Ch1Demo11 {
    public static void main(String[] args) {
        double[] dou = {3, 5, 7, 9, 11, 13};
        double sum1 = 1.0, sum2;

        for (int i=0; i<dou.length; i++){
            if (dou[i] < 13) {
                if (i % 2 == 0) {
                    sum1 = sum1 - (1/dou[i]);
                } else {
                    sum1 = sum1 + (1/dou[i]);
                }
            }
            else {
                sum2 = sum1;
                sum1 = sum1 + (1/dou[5]);
                System.out.println("π=4*(1-1/3+1/5-1/7+1/9-1/11)=" + (4 * sum2));
                System.out.println("π=4*(1-1/3+1/5-1/7+1/9-1/11+1/13)=" + (4 * sum1));
            }
        }
    }
}
