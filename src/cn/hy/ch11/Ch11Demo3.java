package cn.hy.ch11;


import java.io.File;

/**
 * 编写Ch11Demo3类，实现:
 * (1) 图片读取到字节数组
 * (2) 字节数组写出到图片文件。
 * 提示：第（1）问： 可以通过下面两个步骤完成。
 * (a)图片到程序 FileInputStream
 * (b)程序到字节数组ByteArrayOutputStream
 *
 * 第（2）问： 可以通过下面两个步骤完成。
 * (a)字节数组到程序 ByteArrayOutputStream
 * (b)程序到图片文件 FileOutputStream
 */
public class Ch11Demo3 {
    public static void main(String[] args) {
        File readFile = new File("E:\\test\\Penguins.jpg");
        byte[] bytes = new byte[(int) readFile.length()];

        System.out.println(bytes.length);
    }
}
