package cn.hy.ch5;

/*
设计一个扩展自抽象类GeometricObject 1的新类Ch5Demo5（圆），
编写一个测试程序，提示输入圆的半径、颜色、一个是否填充的布尔值，
程序根据输入信息创建一个圆的对象，程序显示面积、周长、颜色、是否被填充。
 */
class TestCh5Demo5{
    public static void main(String[] args) {
        Ch5Demo5 c5d5 = new Ch5Demo5(2.5, "black", true);
        System.out.println(c5d5.toString());
    }
}

public class Ch5Demo5 extends GeometricObject1{
    private double radius;

    public Ch5Demo5(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Area: " + this.getArea() +
                "\nPerimeter: " + this.getPerimeter() +
                "\ncolor: " + this.getColor() +
                "\nisFilled: " + this.isFilled();
    }
}

abstract class GeometricObject1 {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject1() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject1(String color, boolean filled) {
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

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

}