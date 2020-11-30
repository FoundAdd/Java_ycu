package cn.hy.ch9;


import org.junit.Test;

/**
 * 编程一个程序将字符串以空格分成若干个字符串
 */
public class Ch9Demo4 {
    @Test
    public void test() {
        String[] strs = split("This is a test string");

        for(String str : strs) {
            System.out.println(str);
        }
    }
    public String[] split(String str) {
        return str.split(" ");
    }
}
