package cn.hy.ch5;

import cn.hy.ch3.Ch3Demo5;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/*
 根据Ch3Demo5类（第三次作业第五题），设计出一个新的Ch5Demo3类:
（1）添加一个String类型的新据域name来存储客户的名字；
（2）添加一个新的构造方法，该方法创建一个具有指定名字、id和收支额的账户；
（3）添加一个名为transactions的ArrayList类型的新数据域，用于为账户存储交易。
     每笔交易都是一个Transaction类的实例。
     Transaction类结构如下：
        -date  java.util.Date
        -type  char  (W为存款，D为取款)
        -amount double
        -balance double
        -description String
        +Transaction(type: char,amout:double,balance:double,description:String)
        构造器和访问器
（4）修改withdraw和deposit方法，向transactions数组线性表添加一笔交易。
（5）其它所有属性和方法都和编程练习题Ch3Demo5类（第三次作业第五题）相同。

 编写一个测试程序，创建一个年利率为1.5%，收支额为1000，id为1122而名字为George的Ch5Demo3类的账户，
 向该账户存入30美元、40美元和50美元并从该账户中取出5美元、4美元、2美元。
 打印出账户清单，显示账户持有者名字、利率、收支额、和所有的交易。
 */
class TestCh5Demo3{
    public static void main(String[] args) {
        Ch5Demo3 c5d3 = new Ch5Demo3("George", 1122, 1000);
        c5d3.setAnnualInterestRate(0.015);

        c5d3.deposit(30);
        c5d3.deposit(40);
        c5d3.deposit(50);
        c5d3.withDraw(5);
        c5d3.withDraw(4);
        c5d3.withDraw(2);

        System.out.println("Name: " + c5d3.getName());
        System.out.println("ID: " + c5d3.getId());
        System.out.println("AnnualInterestRate: " + c5d3.getAnnualInterestRate());
        System.out.println("balance: " + c5d3.getBalance());

        List<Transaction> list = c5d3.getTransaction();
        for (Transaction transaction : list){
            System.out.printf("----------------------\n");
            System.out.println(transaction.getDate());
            System.out.println(transaction.getType());
            System.out.println(transaction.getAmount());
            System.out.println(transaction.getBalance());
            System.out.println(transaction.getDescription());
        }
    }
}

public class Ch5Demo3 extends Ch3Demo5 {
    private String name;
    private List<Transaction> transaction = new ArrayList();

    public Ch5Demo3(){}

    public Ch5Demo3(String name, int id, double balance){
        super(id, balance);
        this.name = name;
    }

    @Override
    public void withDraw(double dWithDraw) {
        super.withDraw(dWithDraw);
        transaction.add(new Transaction('W', dWithDraw, this.getBalance(), null));
    }

    @Override
    public void deposit(double dDeposit) {
        super.deposit(dDeposit);
        transaction.add(new Transaction('D', dDeposit, this.getBalance(), null));
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public String getName() {
        return name;
    }
}

class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        if (type == 'W' || type == 'D') {
            this.type = type;
        } else{
            System.err.printf("The variable \"type\" can only be assigned to \'W\' or \'D\'");
            return;
        }
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
