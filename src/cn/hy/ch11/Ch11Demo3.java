package cn.hy.ch11;


import java.io.*;

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
    public static void main(String[] args) throws IOException {
        File readFile = new File("G:\\tmp\\test.png");
        FileInputStream fin = new FileInputStream(readFile);
        byte[] bytes = new byte[(int) readFile.length()];
        ByteArrayOutputStream baos = new ByteArrayOutputStream((int) readFile.length());

        fin.read(bytes);
        baos.write(bytes);
        baos.flush();

        //写出
        File writeFile = new File("G:\\tmp\\write.png");
        FileOutputStream fout = new FileOutputStream(writeFile);
        fout.write(baos.toByteArray());
    }
}
