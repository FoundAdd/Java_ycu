package cn.hy.ch4;
/*
（实现String类）Java库中提供了String类，给出你自己对下面方法的实现（将新类命名为Ch4Demo5）：
     public Ch3Demo5(char[] chars);//将字符数组转换成字符串
     public char charAt(int index);//返回字符串中第index个字符
     public int length();//返回字符串的长度
     public Ch3Demo5 substring(int begin,int end);//返回从begin位置开始end结束的字符串
     public Ch3Demo5 toLowerCase();//将字符串的字符转换成小写字母
     public boolean equals(Ch3Demo5 s);//判断两个字符串是否相等
     public int compare(String s);//比较两个字符串的大小
编写一个程序测试这个类中的所有方法。
 */
public class Ch4Demo5 {
    private String string;

    public Ch4Demo5(){}

    public Ch4Demo5(char[] chars){
        this.string = String.valueOf(chars);
    }

    public char charAt(int index){
        char tmp = 0;
        try {
            tmp = this.string.charAt(index);
        } catch (Exception e) {
            System.out.println("The index out of range");
        }
        return tmp;
    }

    public int length(){
        return this.string.length();
    }

    public Ch4Demo5 subString(int start, int end){
        Ch4Demo5 c4d5 = new Ch4Demo5();
        try {
            c4d5.string = this.string.substring(start, end);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("The \"subString\" get an error index!");
        }

        return c4d5;
    }

    public Ch4Demo5 toLowerCase(){
        Ch4Demo5 c4d5 = new Ch4Demo5();
        c4d5.string = this.string.toLowerCase();

        return c4d5;
    }

    public boolean equals(Ch4Demo5 c4d5){
        return this.string.equals(c4d5.string);
    }

    public int compare(String string){
        return this.string.compareTo(string);
    }

    public String getString() {
        return string;
    }
}

class TestCh4Demo5{
    public static void main(String[] args) {
        char c[] = {'1', 'z', 'W', '4', 'A', '1', 'H', 'v', 'q'};
        Ch4Demo5 c4d5 = new Ch4Demo5(c);
        Ch4Demo5 c4d5_1 = new Ch4Demo5(c);
        Ch4Demo5 c4d5_2 = new Ch4Demo5(new char[]{'A', 'M', 'D', ',', 'Y', 'E', 'S'});

        System.out.println("the string value is " + c4d5.getString());
        System.out.println("the index of 2 value is " + c4d5.charAt(2));
        System.out.println("the length is " + c4d5.length());
        System.out.println("the index of 2 to index of 6 value is " + c4d5.subString(2, 6).getString());
        System.out.println("this is to lower case value: " + c4d5.toLowerCase().getString());
        System.out.println("The c4d5 is the same as c4d5_1?  " + c4d5.equals(c4d5_1));
        System.out.println("The c4d5 and c4d5_1 compare value is " + c4d5.compare(c4d5_1.getString()));
    }
}
