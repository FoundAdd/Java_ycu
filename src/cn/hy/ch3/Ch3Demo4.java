package cn.hy.ch3;

import java.util.Date;
/*
设计一个秒表Ch3Demo4的类，该类包含：
（1）具有访问器方法的私有数据域startTime和endTime;
（2）一个无参构造方法，使用当前时间来初始化startTime;
（3）一个名为start()方法，将startTime重设为当前时间；
（4）一个名为Stop()方法，将entTime设置为当前时间；
（5）一个名为getElapsedTime()的方法，以毫秒为单位返回秒表记录的流逝时间。
 */
public class Ch3Demo4 {
    private long startTime;
    private long endTime;

    public Ch3Demo4(){
        this.startTime = new Date().getTime();
    }

    public void start(){
        this.startTime = new Date().getTime();
    }

    public void end(){
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime(long startTime, long endTime){
        return endTime-startTime;
    }
}
