package cn.hy.ch10;


import java.text.NumberFormat;
import java.util.Random;

/**
 * 编写一个程序Ch10Demo3类，随机产生100个成绩，成绩保留两位小数，
 * 计算平均分及统计高于平均分的人数。
 */
public class Ch10Demo3 {
    static NumberFormat numberFormat = NumberFormat.getInstance();

    public static void main(String[] args) {
        double[] scores = scores(100);
        double sum = 0;
        double ave;
        int biggerAve = 0;
        numberFormat.setMaximumFractionDigits(2);

        for (double score : scores) {
            sum += score;
        }
        ave = Double.parseDouble(numberFormat.format(sum/scores.length));

        for (double score : scores) {
            biggerAve = score > ave ? biggerAve+1 : biggerAve;
        }

        System.out.printf("平均分为%.2f\n", ave);
        System.out.println("高于平均分的人数为 " + biggerAve);
    }

    public static double[] scores(int size) {
        double[] scores = new double[size];
        Random random = new Random();
        numberFormat.setMaximumFractionDigits(2);

        for (int i=0; i<scores.length; i++) {
            scores[i] = Double.parseDouble(numberFormat.format(random.nextDouble() * 100));
        }

        return scores;
    }
}
