package cn.hy.ch8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
编写程序Ch8Demo2，
创建一个ArrayList对象,然后向这个对象中添加一个Dog对象，一个Date对象、一个字符串和一个Person对象,
然后使用循环调用对象的toString()方法，来显示列表中的所有的元素。
 */
public class Ch8Demo2{
    @Test
    public void test() {
        List list = new ArrayList();

        list.add(new Ch8Demo1.Dog("dog1", 3));
        list.add(new Date());
        list.add(new String("This is a String"));
        list.add(new Ch8Demo1.Person("peoson1", 16));

        for (Object tmp : list) {
            System.out.println(tmp.toString());
            System.out.println("-----------------");
        }
    }
}