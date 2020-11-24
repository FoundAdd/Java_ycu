package cn.hy.ch2;

/*
假设今年一个大学的学费为10000元，学费的年增长率为5%。
编写程序，计算4年后的学费，以及从今年开始4年内总学费是多少？
 */

public class Ch2Demo10 {
    public static void main(String[] args) {
        double money = 10000;
        int years = 4;
        System.out.println(tuition(money, years));
    }

    /**
     * 计算每年增长后的学费，以及一定年份的学费总额
     * @param money 初始学费
     * @param years 增长年数
     * @return 总学费
     */
    public static double tuition(double money, int years){
        double sumMoney = 0;
        for (int i=0; i<years; i++){
            sumMoney += money;
            money += money * 0.05;
        }
        System.out.println("四年后的学费是" + money + "元");
        return sumMoney;
    }
}
