package cn.hy.ch3;
/*
设计一个股票类Ch3Demo3,这个类包括：
（1）一个名为symbol的字符串数据域表示股票代码；
（2）一个名为name的字符串数据域表示股票的名字；
（3）一个名为previousClosingPrice的double型数据域，它存储的是前一日的股票值；
（4）一个名为currentPrice的double型数据域，它存储的是当时的股票值。
（5）一个名为getChangePercent()的方法，返回从previousClosingPrice到currentPrice的变化的百分比。
 */
public class Ch3Demo3 {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public double getChangePercent(double previousClosingPrice, double currentPrice){
        return (currentPrice - previousClosingPrice) / previousClosingPrice;
    }
}
