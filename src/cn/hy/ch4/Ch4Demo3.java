package cn.hy.ch4;
/*
设计一个名为Ch4Demo3的类，表示一个带x坐标和y坐标的点。这个类包括：
（1）两个带get方法的数据域x 和y分别表示它们的坐标；
（2）一个创建点（0，0）的无参构造方法；
（3）一个创建特定坐标点的构造方法；
（4）一个名为distance的方法，返回从该点到Ch4Demo3类型的指定点之间的距离；
（5）一个名为distance的方法，返回从该点到x和y坐标的指定点之间的距离。
编写一个测试程序，创建两个点（0，0）和（10，30.5），并显示它们之间的距离。
 */

class TestCh4Demo3{
    public static void main(String[] args) {
        Ch4Demo3 c4d3_1 = new Ch4Demo3();
        Ch4Demo3 c4d3_2 = new Ch4Demo3(10, 30.5);

        System.out.println("点1与点2的距离为：" + c4d3_1.distance(c4d3_2));
    }
}

@SuppressWarnings("unused")
public class Ch4Demo3 {
    private final double x;
    private final double y;

    public Ch4Demo3(){
        this.x = 0;
        this.y = 0;
    }

    public Ch4Demo3(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Ch4Demo3 c4d3){
        return Math.sqrt( Math.pow(this.x - c4d3.x, 2) + Math.pow(this.y - c4d3.y, 2) );
    }

    public double distance(double x, double y){
        return Math.sqrt( Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) );
    }
}
