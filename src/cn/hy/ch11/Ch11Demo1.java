package cn.hy.ch11;


import java.io.*;

/**
 * 编写Ch11Demo1类，实现各类文件的复制。
 * 提示：（1）使用FileInputStream把文件内容按字节方式读入到程序中。
 *       （2）再使用FileOutputStream把刚读入的内容写入到某个文件中。
 */
public class Ch11Demo1 {
    public static void main(String[] args) {
        File readFile = new File("E:\\test\\txt1.txt");
        File writeFile = new File("E:\\test\\txt2.txt");
        byte[] b = new byte[(int) readFile.length()];
        try {
            FileInputStream fin = new FileInputStream(readFile);
            System.out.println("读出数据：" + fin.read(b) + " byte");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fout = new FileOutputStream(writeFile);
            fout.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
