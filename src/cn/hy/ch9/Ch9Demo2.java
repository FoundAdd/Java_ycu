package cn.hy.ch9;


import org.junit.Test;

/**
 * 编写一个程序用来检查一个字符串是否以大写字母开头，以句号结束，
 * 并找出所有不以大写字母开头的词，不重复地计算其个数。
 */
public class Ch9Demo2 {
    @Test
    public void test() {
        System.out.println(matchStyle("A String to test regx。"));
        System.out.println(countLower("A string to test regx。"));
    }

    public int countLower (String str) {
        String[] strs = str.split(" ");
        int lowerSum = 0;

        for (String tmp : strs) {
            lowerSum = tmp.matches("^(?![A-Z]).*$") ? lowerSum+1 : lowerSum;
        }

        return lowerSum;
    }
    public boolean matchStyle(String str) {
        if (str.matches("A.*。")) {
            return true;
        }
        return false;
    }
}
