package cn.hy.ch10;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 编写一个程序Ch10Demo4类，
 * 使用SimpleDateFormat类以“yyyy-mm-dd hh:mm:ss”格式 输出系统时间，
 * 使用Calendar类输出年、月、日。
 */
public class Ch10Demo4 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        String strDate = simpleDateFormat.format(date);
        calendar.setTime(date);

        System.out.println(strDate);
        System.out.println(calendar.get(Calendar.YEAR) + "年");
        System.out.println((calendar.get(Calendar.MONTH)+1)+ "月");
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)+ "日");
    }
}
