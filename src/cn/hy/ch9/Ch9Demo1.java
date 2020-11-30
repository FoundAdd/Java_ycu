package cn.hy.ch9;


/**
 * 编写一个程序Ch9Demo1类，创建一个StringBuilder的可变长字符串对象，
 * 把“Hello”字符串追加到后面，再插入“yichun”到0位置，
 * 将第5位置的空格替换为逗号，再删除逗号，再反转字符串，再输出其长度和字符串。
 */
public class Ch9Demo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("Hello");
        sb.append("yichun", 0, 6);
        sb.replace(5, 5, ",");
        sb.replace(5, 6, "");
        sb.reverse();

        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}
