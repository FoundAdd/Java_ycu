package cn.hy.ch8;

import java.util.List;
import org.junit.Test;

/*
编写程序Ch8Demo5，定义一个泛型方法，方法中实现集合元的排序（根据狗的编号排序）；
定义 一个狗类，属性有狗的编号，在main方法中定义一个狗类容器，调用泛型方法。
 */
public class Ch8Demo5{
    class Dog {
        private int dogId;

        public int getDogId() {
            return dogId;
        }

        public void setDogId(int dogId) {
            this.dogId = dogId;
        }
    }
}