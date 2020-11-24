package cn.hy.ch3;

import java.util.Date;

/*
设计一个类Ch3Demo5，它包括：
（1）一个名为id的int类型私有数据域，默认值0；
（2）一个名为balance的double类型私有数据域，默认值0；
（3）一个名为annualInterestRate的double类型私有数据域存储当前利率，默认值0。假设所有的帐户都有相同的利率。
（4）一个名为dateCreated的Date类型的私有数据域，存储账户的开户日期；
（5）一个用于创建默认帐户的无参构造方法；
（6）一个用于创建带特定id和初始余额的帐户的构造方法;
 */
class Test{
    public static void main(String[] args) {
        Ch3Demo5 account1 = new Ch3Demo5(1122, 20000);
        account1.setAnnualInterestRate(0.045);

        account1.withDraw(2500);
        account1.deposit(3000);

        System.out.println("账户余额：" + account1.getBalance());
        System.out.println("本月利息：" + account1.getBalance() * account1.getMonthlyInterestRate());
        System.out.println("账户创建日期：" + account1.getDateCreated());
    }
}

public class Ch3Demo5 {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Ch3Demo5(){}

    public Ch3Demo5(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }

    public void withDraw(double dWithDraw){
        if (balance >= dWithDraw) {
            this.balance -= dWithDraw;
        }
        else {
            this.balance = 0;
            System.out.println("Your balance is insufficient");
        }
    }

    public void deposit(double dDeposit){
        this.balance += dDeposit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
