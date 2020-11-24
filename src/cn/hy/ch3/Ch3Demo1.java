package cn.hy.ch3;
/*
编写程序，定义一个类Ch3Demo1：利用方法的重载，完成以下方法。
（1）第一个方法是public int max(int x,int y)，用于计算两个整数的最大值。
（2）第二个方法是public double max(double x,double y)，用于计算两个double型数据的最大值。
（3）第三个方法是public double max(int x,double y)，用于计算一个整数和一个double型数据的最大值。
（4）第四个方法是public double max(int x,int y,int z )，用于计算三个整数的最大值。
编写测试方法（main）分别去调用一个对象的这些方法来完成测试。
*/
public class Ch3Demo1 {
    public static void main(String[] args) {
        Utils ut = new Utils();
        int iX = 1, iY = 2, iZ = 3;
        double dX = 4.0, dY = 5.0;

        System.out.println(ut.max(iX, iY));
        System.out.println(ut.max(iX, dY));
        System.out.println(ut.max(dX, dY));
        System.out.println(ut.max(iX, iY, iZ));
    }
}

class Utils{
    public int max(int x, int y){
        int maxValue = 0;
        maxValue = x>y ? x : y;
        return maxValue;
    }

    public double max(double x, double y){
        double maxValue = 0;
        maxValue = x>y ? x : y;
        return maxValue;
    }

    public double max(int x, double y){
        double maxValue = 0;
        maxValue = x>y ? x*1.0 :  y;
        return maxValue;
    }

    public double max(int x, int y, int z){
        double maxValue = 0;

        if (x>y && x>z){
            maxValue = x*1.0;
        }
        else if (x>y && x<z){
            maxValue = z*1.0;
        }
        else {
            maxValue = y>z ? y*1.0 : z*1.0;
        }

        return maxValue;
    }
}
