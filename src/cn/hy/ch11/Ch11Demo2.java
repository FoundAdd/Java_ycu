package cn.hy.ch11;


import org.junit.Test;

import java.io.*;

/**
 * 编写Ch11Demo2类，实现字符文件的复制。
 * 提示：（1）使用FileReader把文件内容按字节方式读入到程序中。
 *       （2）再使用FileWriter把刚读入的内容写入到某个文件中。
 */
public class Ch11Demo2 {
    public static void main(String[] args) throws IOException {
        File readFile = new File("E:\\test\\txt1.txt");
        File writeFile = new File("E:\\test\\txt2.txt");
        char[] chars = new char[(int) readFile.length()];
        FileReader fr = new FileReader(readFile);

        fr.read(chars);

        FileWriter fw = new FileWriter(writeFile);

        for (char c : chars) {
            fw.append(c);
            fw.flush();
        }
    }
}
