package cn.hy.ch5;

/*
Person类结构如下:
    -name: String
    -age: int
    -address: String
    -phone: String
    +Person() //构造方法
    +Person(name:String, age:int, address:String, phone:String) //构造方法
    +work():void //输出人类需要工作来体现人生价值
    +study():void //抽象方法
Student类结构如下 (extends Person):
    -school:String
    +Student(name:String, age:int, address:String, phone:String) //构造方法
    +work():void //输出学生的工作是帮助老师参与学校的学生管理工作，提高综合素质
    +study():void //抽象方法实现，输出全日制在宜春学院学习
Employee类结构如下 (extends Person):
    -office: String
    +Employee(name:String, age:int, address:String, phone:String)//构造方法
    +work():void //输出雇员工作是为了养活自己和家人
    +study():void //抽象方法实现，输出在职学习也能学到知识

(1)根据以上关系设计三个类Person、Student、Employee类。
(2)设计一个测试类Test类，采用多态的工作原理分别
输出“学生的工作是帮助老师参与学校的学生管理工作，提高综合素质”
和输出“雇员工作是为了养活自己和家人”。
*/
public class Ch5Demo4 {
    public static void main(String[] args) {
        Student student = new Student("name", 1, "address", "phone");
        Employee employee = new Employee("name", 1, "address", "phone");

        student.work();
        employee.work();
    }
}

abstract class Person{
    private String name;
    private int age;
    private String address;
    private String phone;

    public Person(){}

    public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void work(){
        System.out.println("人类需要工作来体现人生价值");
    }

    public abstract void study();
}

class Student extends Person{
    private String school;

    public Student(String name, int age, String address, String phone){
        super(name, age, address, phone);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是帮助老师参与学校的学生管理工作，提高综合素质");
    }

    @Override
    public void study() {
        System.out.println("全日制在宜春学院学习");
    }
}

class Employee extends Person{
    private String office;

    public Employee(String name, int age, String address, String phone){
        super(name, age, address, phone);
    }

    @Override
    public void work() {
        System.out.println("雇员工作是为了养活自己和家人");
    }

    @Override
    public void study() {
        System.out.println("在职学习也能学到知识");
    }
}
