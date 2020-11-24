package cn.hy.ch4;

import java.util.Calendar;

/*
设计一个时间 类Ch4Demo1,这个类包含：
（1）表示时间的数据域hour、minute和second;
（2）一个以当前时间创建Ch4Demo1对象的无参构造方法（数据域的值表示当前时间）；
（3）一个构造Ch4Demo1对象的构造方法，这个对象有一个特定的时间值，
这个值是以毫秒表示的、从1970年1月1日午夜开始到现在流逝的时间段（数据域的值表示这个时间）；
（4）一个构造带特定的小时、分钟和秒的Ch4Demo1对象的构造方法；
（5）三个数据域hour、minute和second各自的get方法；
（6）一个名为setTime(long elapseTime)的方法使用流逝的时间给对象设置一个新时间。
    例如，如果流逝的时间为555550000毫秒，则转换为10小时、10分钟、10秒。
编写一个测试程序，创建两个Ch4Demo1对象（使用new Ch4Demo1()和new Ch4Demo1(555550000)）,然后显示它们的小时、分钟和秒。
 */

class Test{
    public static void main(String[] args) {
        Ch4Demo1 c4d1_1 = new Ch4Demo1();
        Ch4Demo1 c4d1_2 = new Ch4Demo1(555550000);

        System.out.println("对象1的时间为 " + c4d1_1.getHour() + ":" + c4d1_1.getMinute() + ":" + c4d1_1.getSecond());
        System.out.println("对象2的时间为 " + c4d1_2.getHour() + ":" + c4d1_2.getMinute() + ":" + c4d1_2.getSecond());
    }
}

public class Ch4Demo1 {
    private Integer hour;
    private Integer minute;
    private Integer second;

    public Ch4Demo1(){
        Calendar calendar = Calendar.getInstance();
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public Ch4Demo1(long time){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public Ch4Demo1(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setTime(long elapseTime){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(elapseTime);

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
}
