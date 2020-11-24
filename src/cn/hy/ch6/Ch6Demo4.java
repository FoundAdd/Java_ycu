package cn.hy.ch6;

/*
学校中有老师和学生两类人，而在职研究生既是老师又是学生，对学生的管理和对教师的管理在他们身上都有体现。
（1）设计学生信息管理接口StudentManageInterface。
     其中包括setFee()方法和getFee()方法，分别用于设置和获取学生的每学期的学费,假设每学期的学费为整数；
（2）设计教师信息管理接口TeacherManageInterface。
     其中包括setPay()方法和getPay()方法，分别用于设置和获取教师的月工资，假设月工资为整数；
（3）设计在职研究生类Graduate，实现StudentInterface接口和TeacherInterface接口，
     它的成员变量有name(姓名)、sex(性别)、fee(每学期学费)、pay(月工资)；
创建一个姓名为“张翠花”的女研究生，统计他的年收入和学费，
如果每年的收入减去学费开销不足20000元，则输出“需要贷款!”的信息。
 */
public class Ch6Demo4 {
    public static void main(String[] args) {
        Graduate graduate = new Graduate();

        graduate.setName("张翠花");
        graduate.setSex("女");
        graduate.setFee((int) Math.floor(Math.random() * 10000));
        graduate.setPay((int) Math.floor(Math.random() * 10000));

        System.out.println("每年收入：" + graduate.getPay()*12);
        System.out.println("每年学费：" + graduate.getFee()*2);
        if (graduate.getPay()*12 - graduate.getFee()*2 <20000){
            System.out.println("需要贷款！");
        }
    }
}

interface StudentManageInterface{
    public void setFee(Integer fee);

    public Integer getFee();
}

interface TeacherManageInterface{
    public void setPay(Integer fee);

    public Integer getPay();
}

class Graduate implements StudentManageInterface,TeacherManageInterface{
    private String name;
    private String sex;
    private Integer fee;
    private Integer pay;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getFee() {
        return fee;
    }

    @Override
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    @Override
    public Integer getPay() {
        return pay;
    }

    @Override
    public void setPay(Integer pay) {
        this.pay = pay;
    }
}