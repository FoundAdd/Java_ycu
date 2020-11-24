package cn.hy.ch5;

import java.util.Scanner;

/*
设计一个三角形 类Ch5Demo1来扩展Geometricobject类。这个类包括：
（1）三个名为side1、side2、side3的double数据域表示这个三角形的三条边，它们默认值是1.0；
（2）一个无参构造方法创建默认的三角形；
（3）一个创建指定side1、side2、side3的三角形的构造方法；
（4）所有三个数据域的访问器方法；
（5）一个名为getArea()的方法返回这个三角形的面积；
（6）一个名为getPerimeter()方法返回这个三角形的周长；
（7）一个名为toString()的方法返回这个三角形的字符串描述；
编写一个测试程序，提示用户输入三角形的三条边、颜色以及一个Boolean值表明该三角形是否填充。
程序应该使用输入创建一个具有这些边并设置color和filled属性的三角形。
程序应该显示面积、边长、颜色以及表明是否填充的真或假的值。
 */
class TestCh5Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String side, color;
        boolean filled;
        double side1, side2, side3;
        Ch5Demo1 c5d1;

        System.out.printf("Please input three side(Separate the values with Spaces): ");
        side = sc.nextLine();
        System.out.printf("Please input the color which you want to fill: ");
        color = sc.nextLine();
        System.out.printf("Would you like fill this triangle? Input \"true\" or \"false\": ");
        filled = sc.nextBoolean();

        side1 = Double.valueOf(side.split(" ")[0]);
        side2 = Double.valueOf(side.split(" ")[1]);
        side3 = Double.valueOf(side.split(" ")[2]);

        c5d1 = new Ch5Demo1(side1, side2, side3);
        c5d1.setColor(color);
        c5d1.setFilled(filled);
        System.out.println(c5d1.toString());
        System.out.println();
    }
}

public class Ch5Demo1 extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Ch5Demo1(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Ch5Demo1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p-this.side1) *  (p-this.side2) * (p-this.side3));
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    public String toString(){
        return super.toString() + "\nThis triangle side1 is " + this.side1 +
                ", side2 is " + this.side2 +
                ", side3 is " + this.side3 +
                "\nThe area is " + this.getArea() +
                "\nThe perimeter is " + this.getPerimeter();
    }
}

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}

