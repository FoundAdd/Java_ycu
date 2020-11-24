package cn.hy.ch3;
/*
设计一个矩形类Ch3Demo2，这个类包括：
（1）两个名为width和height的double型数据域，它们分别表示矩形的宽和高。width和height的默认值都为1；
（2）创建一个默认矩形的无参构造方法；
（3）一个创建width和height为指定值的矩形的构造方法；
（4）一个名为getArea()的方法返回这个矩形的面积；
（5）一个名为getPerimeter()的方法返回周长。
 */
public class Ch3Demo2 {
    private double width = 1;
    private double height = 1;

    public Ch3Demo2(){

    }

    public Ch3Demo2(double dWidth, double dHeight){
        this.width = dWidth;
        this.height = dHeight;
    }

    public double getArea(double width, double height){
        return width * height;
    }

    public double getPerimeter(double width, double height){
        return 2*(width + height);
    }
}
