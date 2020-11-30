package cn.hy.ch9;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 编写一个程序将字符串中的元音字母用*号替换。
 */
public class Ch9Demo3 {
    public static void main(String[] args) {
        String str = new String("auhcbiwyafvgguuuyiucw");
        System.out.println(replace(str));
    }

    public static String replace(String str) {
//        Pattern pattern = Pattern.compile("[a e i o u]");
//        Matcher matcher = pattern.matcher(str);
//
//        while (matcher.find()) {
////            System.out.println(matcher.start() + " " + matcher.end());
//            System.out.println(str.substring(matcher.start(), matcher.end()));
//        }
        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++) {
            if ( String.valueOf(chars[i]).matches("[a e i o u]") ) {
                chars[i] = '*';
            }
        }

        return String.valueOf(chars);
    }
}
