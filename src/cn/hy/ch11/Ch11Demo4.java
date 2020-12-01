package cn.hy.ch11;


import org.junit.Test;

import java.io.*;

/**
 * 编写Ch11Demo4类，将第一题“Ch11Demo1类，实现各类文件的复制”
 * 加上缓冲流(BufferedInputStream、BufferedOutputStream)实现提高性能。
 */
public class Ch11Demo4 extends Ch11Demo1{
    @Test
    public void test() {
        readAndwrite();
    }

    @Override
    public void readAndwrite() {
        File readFile = new File("G:\\tmp\\txt1.txt");
        File writeFile = new File("G:\\tmp\\txt2.txt");
        byte[] b = new byte[(int) readFile.length()];
        try {
            FileInputStream fin = new FileInputStream(readFile);
            BufferedInputStream bin = new BufferedInputStream(fin);

            int index = 0;
            while ( (index = bin.read(b)) != -1) {
                String chunk = new String(b, 0, index);
                System.out.println(chunk);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //写入到文件
        try {
            FileOutputStream fout = new FileOutputStream(writeFile);
            BufferedOutputStream bout = new BufferedOutputStream(fout);

            bout.write(b);
            bout.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
