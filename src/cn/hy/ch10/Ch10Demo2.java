package cn.hy.ch10;


/**
 * 编写一个程序Ch10Demo2类，创建一个StringBuilder对象，
 * 把“java”字符串追加到后面，再插入“hello   ”到0位置，
 * 将第5位置的空格替换为逗号，再删除逗号，再反转字符串，再输出其长度和字符串。
 */
public class Ch10Demo2 {
    public static void main(String[] args) {
        StringBuilder sbd = new StringBuilder();

        sbd.append("java");
        sbd.insert(0, "hello");
        sbd.replace(5, 5, ",");
        sbd.delete(5, 6);
        sbd.reverse();

        System.out.println("The string length is " + sbd.length());
        System.out.println(sbd.toString());
    }
}
