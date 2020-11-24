package cn.hy.test;

import org.junit.Test;

public class Test01 {
    public static void f(A y){
        y.num = 20;
    }

    public static void main(String[] args) {
        A x = new A();
        x.num = 10;
        System.out.println(x.num);
        f(x);
        System.out.println(x.num);
    }
    @Test
    public void test(){
        System.out.println(3<<3);
    }
}

class A{
    int num;
}
