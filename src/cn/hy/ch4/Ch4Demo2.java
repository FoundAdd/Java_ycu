package cn.hy.ch4;
/*
设计一个名为Ch4Demo2的类。这个类包括：
（1）一个名为value的int型数据域，存储这个对象表示的int值；
（2）一个为指定的int值创建Ch3Demo2对象的构造方法；
（3）一个返回int值的get方法；
（4）如果值分别偶数、奇数或素数，那么isEven()、isOdd()和isPrime()方法都会返回true;
（5）如果指定值分别为偶数、奇数或素数，那么相应的静态方法isEven(int)、isOdd(int)和isPrime(int)方法都会返回true;
（6）如果指定值分别为偶数、奇数或素数，那么相应的静态方法isEven(Ch3Demo2)、isOdd(Ch3Demo2)和isPrime(Ch3Demo2)方法都会返回true;
（7）如果该对象的值与指定的值相等，那么equals(int)和equals(Ch3Demo2)方法返回true；
（8）静态方法parseInt(char[])将数字字符构成的数组转换为一个int值。
（9）静态方法parseInt(String)将一个字符串转换为一个int值。
编写一个程序测试这个类中的所有方法。
 */
class TestCh4Demo2{
    public static void main(String[] args) {
        Ch4Demo2 c4d2 = new Ch4Demo2(175);
        Ch4Demo2 c4d2_1 = new Ch4Demo2(169);
        char[] cArray = {'9', '3', '3'};
        String string = "123";

        System.out.println(c4d2.getValue());
        System.out.println(c4d2.isEven());
        System.out.println(c4d2.isOdd());
        System.out.println(c4d2.isPrime());
        System.out.println(c4d2.isEven(154));
        System.out.println(c4d2.isOdd(56));
        System.out.println(c4d2.isPrime(253));
        System.out.println(c4d2.isEven(c4d2_1));
        System.out.println(c4d2.isOdd(c4d2_1));
        System.out.println(c4d2.isPrime(c4d2_1));
        System.out.println(c4d2.equals(175));
        System.out.println(c4d2.equals(c4d2_1));
        System.out.println(c4d2.parseInt(cArray));
        System.out.println(c4d2.parseInt(string));
    }
}

public class Ch4Demo2 {
    private int value;

    public Ch4Demo2(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return (this.value%2==0 ? true : false);
    }

    public boolean isOdd(){
        return (this.value%2!=0 ? true : false);
    }

    public boolean isPrime(){
        boolean isPrime = true;
        if (this.value == 1 || this.value%2 == 0 && this.value != 2){
            isPrime = false;
        }
        else {
            for (int i=3; i<Math.sqrt(this.value); i+=2){
                if (this.value%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static boolean isEven(int value){
        return (value%2==0 ? true : false);
    }

    public static boolean isOdd(int value){
        return (value%2!=0 ? true : false);
    }

    public static boolean isPrime(int value){
        boolean isPrime = true;
        if (value == 1 || value%2 == 0 && value != 2){
            isPrime = false;
        }
        else {
            for (int i=3; i<Math.sqrt(value); i+=2){
                if (value%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static boolean isEven(Ch4Demo2 c4d2){
        return (c4d2.value%2==0 ? true : false);
    }

    public static boolean isOdd(Ch4Demo2 c4d2){
        return (c4d2.value%2!=0 ? true : false);
    }

    public static boolean isPrime(Ch4Demo2 c4d2){
        boolean isPrime = true;
        if (c4d2.value == 1 || c4d2.value%2 == 0 && c4d2.value != 2){
            isPrime = false;
        }
        else {
            for (int i=3; i<Math.sqrt(c4d2.value); i+=2){
                if (c4d2.value%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public boolean equals(int value){
        return ( this.value==value ? true : false );
    }

    public boolean equals(Ch4Demo2 c4d2){
        return ( this.value==c4d2.value ? true : false );
    }

    public static int parseInt(char[] cArray){
        int tmp = 0;
        try {
            tmp = Integer.parseInt(String.valueOf(cArray));
        } catch (NumberFormatException e) {
            System.out.println("仅支持数字符号！！！");
        }
        return tmp;
    }

    public static int parseInt(String string){
        int tmp = 0;
        try {
            tmp = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("仅支持数字符号！！！");
        }
        return tmp;
    }
}
