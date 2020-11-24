package cn.hy.ch5;

import cn.hy.ch3.Ch3Demo5;

/*
设计一个类Ch5Demo21（支票账户）和Ch5Demo22（储蓄账户）来扩展Ch3Demo5类（第三次作业第五题）。
Ch5Demo21类包括：支票账户有一个透支限定额，但储蓄账户不能透支。
创建Ch3Demo5、Ch5Demo21、Ch5Demo22的对象，然后调用它们的toString()方法。
 */
public class Ch5Demo2 {
    public static void main(String[] args) {
        Ch3Demo5 c3d5 = new Ch3Demo5(1121, 7000);
        Ch5Demo21 c5d21 = new Ch5Demo21(1122, 8000);
        Ch5Demo22 c5d22 = new Ch5Demo22(1123, 6000);

        c5d21.setOverdraft(50000);

        System.out.printf(c5d21.toString());
        System.out.printf("\n---------------\n" + c5d22.toString());
    }
}

// 支票账户
class Ch5Demo21 extends Ch3Demo5 {
    private double overdraft;

    Ch5Demo21(){}

    Ch5Demo21(int id, double balance){
        super(id, balance);
        this.setAnnualInterestRate(0.045);
    }

    public String toString(){
        return "账户类型：支票账户" + "\n账户余额：" + this.getBalance() + "\n透支额度：" + this.getOverdraft() + "\n本月利息：" + (this.getBalance() * this.getMonthlyInterestRate() + "\n账户创建日期：" + this.getDateCreated());
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}

// 储蓄账户
class Ch5Demo22 extends Ch3Demo5 {
    Ch5Demo22(){}

    Ch5Demo22(int id, double balance){
        super(id, balance);
        this.setAnnualInterestRate(0.045);
    }

    public String toString(){
        return "账户类型：储蓄账户" + "\n账户余额：" + this.getBalance() + "\n本月利息：" + (this.getBalance() * this.getMonthlyInterestRate() + "\n账户创建日期：" + this.getDateCreated());
    }
}
