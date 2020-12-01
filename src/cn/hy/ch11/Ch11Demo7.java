package cn.hy.ch11;


import org.junit.Test;

import java.io.*;

/**
 * 编写Ch11Demo7类，程序将一个人和一条狗写入到文件中（序列化），再从文件中读取这两个对象，并输出。
 */
public class Ch11Demo7 {
    File file = new File("G:\\tmp\\Ch11Demo7.txt");
    @Test
    public void test() throws IOException, ClassNotFoundException {
        Person person = new Person("张三");
        Dog dog = new Dog("狗张三");

        //将序列化对象写入到文件
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);

        oout.writeObject(person);
        oout.writeObject(dog);

        //从文件中读取序列化对象
        FileInputStream fin = new FileInputStream(file);
        ObjectInputStream oin = new ObjectInputStream(fin);

        Person readPerson = (Person) oin.readObject();
        Dog readDog = (Dog) oin.readObject();

        System.out.println(readPerson.toString());
        System.out.println(readDog.toString());
    }
}

class Person implements Serializable{
    private String name;

    public Person(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "This is a people who named " + name;
    }
}

class Dog implements Serializable{
    private String name;

    public Dog(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "This is a dog who named " + name;
    }
}
