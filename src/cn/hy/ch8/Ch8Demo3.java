package cn.hy.ch8;

import java.util.LinkedList;
import java.util.List;

/*
创建一个名为Ch8Demo3的类，该类拥有一个整数域gerbilNumber，通过构造器初始化gerbilNumber。
创建方法hop()显示该对象的gerbilNumbert属性和字符串 “is hopping.” 。
创建一个LinkedList，并将Gerbil对象添加到该容器中。
用get()方法遍历List中所有的Gerbil对象，并调用hop()方法。
 */
public class Ch8Demo3{
    private int gerbilNumber;

    public static void main(String[] args) {
        List<Ch8Demo3> list = new LinkedList();

        list.add(new Ch8Demo3(123));
        list.add(new Ch8Demo3(456));
        list.add(new Ch8Demo3(789));

        for (Ch8Demo3 tmp : list) {
            tmp.hop();
            System.out.println("----------------");
        }
    }

    public void hop() {
        System.out.println(getGerbilNumber());
        System.out.println("is hopping");
    }

    public Ch8Demo3(int gerbilNumber) {
        setGerbilNumber(gerbilNumber);
    }

    public int getGerbilNumber() {
        return gerbilNumber;
    }

    public void setGerbilNumber(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
}