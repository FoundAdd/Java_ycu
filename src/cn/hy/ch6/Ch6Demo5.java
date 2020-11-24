package cn.hy.ch6;

/*
设计一个接口Student，该接口描述的是本科生（StudentG）和硕士生（StudentM）的公共方法：
设置姓名、设置学号，输出所有信息，判断学生是否优秀。
在该接口的基础上实现两个类StudentG和StudentM。
StudentG属性：姓名，学号，是否过CET4，上学年综合测评成绩。
StudentG包含方法：构造函数，设置是否过CET4，设置上学年综合测评成绩，
    接口中定义的所有方法（本科生优秀的标准是过CET4,上学年综合测评成绩大于85分）。
StudentM属性：姓名，学号，是否过CET6，已发表文章篇数。
StudentM包含方法：构造函数，设置是否过CET6，设置发表文章篇数，
    接口中定义的所有方法（硕士生优秀的标准是过CET6,已发表文章篇数大于1）。
要求:
（1）实现上述的接口和类；
（2）（在main函数内）实例化五个对象：三个本科生，两个硕士生 （至少各有一个优秀）；
（3）用多态的性质来判断所实例化的五个学生是否优秀；
（4）输出优秀学生的所有属性信息。
 */
@SuppressWarnings("unuse")
public class Ch6Demo5 {
    public static void main(String[] args) {
        StudentG stuG1 = new StudentG("张三", 01);
        StudentG stuG2 = new StudentG("李四", 02);
        StudentG stuG3 = new StudentG("王五", 03);
        StudentM stuM1 = new StudentM("钱六", 04);
        StudentM stuM2 = new StudentM("赵七", 05);

        {
            stuG1.setLastScore(99);
            stuG1.setPassCET4(true);

            stuG2.setLastScore(73);
            stuG2.setPassCET4(true);

            stuG3.setLastScore(59);
            stuG3.setPassCET4(false);

            stuM1.setSumSCI(6);
            stuM1.setPassCET6(true);

            stuM2.setSumSCI(0);
            stuM2.setPassCET6(true);
        }

        Student[] stuArray = {stuG1, stuG2, stuG3, stuM1, stuM2};

        for (Student stu : stuArray){
            if (stu.isGood()){
                stu.printInfo();
                System.out.println("-----------------------");
            }
        }
    }
}

interface Student{
    public void setName(String name);

    public void setStuId(Integer stuId);

    public void printInfo();

    public boolean isGood();
}

class StudentG implements Student{
    private String name;
    private Integer stuId;
    private boolean isPassCET4;
    private Integer lastScore;

    public StudentG(String sName, Integer iStuId){
        this.name = sName;
        this.stuId = iStuId;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public void setPassCET4(boolean passCET4) {
        isPassCET4 = passCET4;
    }

    public void setLastScore(Integer lastScore) {
        this.lastScore = lastScore;
    }

    @Override
    public void printInfo() {
        System.out.println("姓名：" + this.name);
        System.out.println("学号：" + this.stuId);
        System.out.println("过四级了吗？：" + this.isPassCET4);
        System.out.println("上学年综合成绩：" + this.lastScore);
    }

    @Override
    public boolean isGood() {
        return (this.isPassCET4 && this.lastScore >85);
    }
}

class StudentM implements Student{
    private String name;
    private Integer stuId;
    private boolean isPassCET6;
    private Integer sumSCI;

    public StudentM(String sName, Integer iStuId){
        this.name = sName;
        this.stuId = iStuId;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public void setPassCET6(boolean passCET6) {
        isPassCET6 = passCET6;
    }

    public void setSumSCI(Integer sumSCI) {
        this.sumSCI = sumSCI;
    }

    @Override
    public void printInfo() {
        System.out.println("姓名：" + this.name);
        System.out.println("学号：" + this.stuId);
        System.out.println("过六级了吗？" + this.isPassCET6);
        System.out.println("发几篇SCI？" + this.sumSCI);
    }

    @Override
    public boolean isGood() {
        return (this.isPassCET6 && this.sumSCI > 1);
    }

}