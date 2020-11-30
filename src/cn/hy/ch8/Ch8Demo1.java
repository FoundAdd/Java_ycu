package cn.hy.ch8;

import java.util.HashSet;
import java.util.Set;

/*
编写程序Ch8Demo1类
编写一个人的类，有属性：姓名，年龄。
构造方法：设定姓名，年龄
普通方法：显示此人的信息（姓名，年龄）
姓名及年龄相同的人是同一个人
年龄大的人比年龄小的人大
编写一个狗的类，内容和人类相同
编写一个测试的main方法，定义一个容器类(set)，放入三个人，两条狗，实现增加及移除输出容器类的信息。
 */
public class Ch8Demo1{
    public static void main(String[] args) {
        Person people1 = new Person("张三", 18);
        Person people2 = new Person("张三", 18);
        Person people3 = new Person("李四", 26);
        Dog dog1 = new Dog("张三", 18);
        Dog dog2 = new Dog("李四", 26);

        System.out.println(people1);
        System.out.println(people2);
        System.out.println(people3);
        System.out.println(dog1);
        System.out.println(dog2);

        Set set = new HashSet();

        set.add(people1);
        set.add(people2);
        set.add(people3);
        set.add(dog1);
        set.add(dog2);

        for (Object ob : set){
            try {
                Person peoTmp = (Person) ob;
                System.out.println(peoTmp.toString());
            } catch (Exception e) {
                Dog dogTmp = (Dog) ob;
                System.out.println(dogTmp.toString());
            }
            System.out.println("------------------------------");

        }
    }


    static class Person{
        private String sName;
        private Integer iAge;

        public String getsName() {
            return sName;
        }

        public Integer getiAge() {
            return iAge;
        }

        Person(String name, Integer age){
            this.sName = name;
            this.iAge = age;
        }
        public String toString(){
            return "name：" + sName + "\nage：" + iAge;
        }
    }

    static class Dog{
        private String sName;
        private Integer iAge;

        Dog(String name, Integer age){
            this.sName = name;
            this.iAge = age;
        }

        public String getsName() {
            return sName;
        }

        public Integer getiAge() {
            return iAge;
        }

        public String toString(){
            return "name：" + sName + "\nage：" + iAge;
        }
    }
}

