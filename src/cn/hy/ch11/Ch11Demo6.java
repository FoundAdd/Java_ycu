package cn.hy.ch11;


import java.io.*;

/**
 * 编写Ch11Demo6类，使用DataOutputStream类将“宜春学院”，60，true 三个数据写入到字节数组中，
 * 再从字节数组中读入到程序中来，并输出。
 */
public class Ch11Demo6 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        DataOutputStream dout = new DataOutputStream(baos);

        dout.writeUTF("宜春学院");
        dout.writeInt(60);
        dout.writeBoolean(true);

        //读入到程序
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        DataInputStream din = new DataInputStream(bais);

        System.out.println(din.readUTF());
        System.out.println(din.readInt());
        System.out.println(din.readBoolean());
    }
}
