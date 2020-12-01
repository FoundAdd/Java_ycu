package cn.hy.ch11;


import java.io.*;

/**
 * 编写Ch11Demo5类，使用InputStreamReader、InputStreamWriter，
 * 实现读取System.in上的字节输入流转换成字符流，并将其写出到System.out上。
 * 建议加上缓冲流。
 */
public class Ch11Demo5 {
    public static void main(String[] args) throws IOException {
        char[] chars = new char[1024];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        br.read(chars);

        //写出到System.out
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(chars);
        bw.flush();
    }
}
