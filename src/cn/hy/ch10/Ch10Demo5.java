package cn.hy.ch10;


import java.io.File;
import java.io.IOException;

/**
 * 编写一个程序Ch10Demo5类，使用File类实现创建一个新文件，创建一个目录。
 */
public class Ch10Demo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\test");

        file.mkdirs();

        File.createTempFile("test", ".txt", file);
    }
}
