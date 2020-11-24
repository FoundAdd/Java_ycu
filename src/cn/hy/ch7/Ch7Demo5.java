package cn.hy.ch7;

import org.junit.Test;

/*
编写一个程序Ch7Demo5类，并在类中写一个方法void isTriangle(int a,int b,int c),
判断三个参数是否能构成一个三角形。
如果不能，则抛出异常IllegalArgumentException,显示：“a,b,c不能构成三角形”，
如果可以，则显示三角形的三个边长。
在主方法提示用户输入三个整数，调用此方法，并捕获异常和处理异常。
 */
public class Ch7Demo5 {
    @Test
    public void test(){
        int a = 3;
        int b = 4;
        int c = 5;

        isTriangle(a, b, c);
    }

    void isTriangle(int a,int b,int c){
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("a边长为：" + a);
            System.out.println("b边长为：" + b);
            System.out.println("c边长为：" + c);
        } else {
            throw new IllegalArgumentException("a,b,c不能构成三角形");
        }
    }
}
