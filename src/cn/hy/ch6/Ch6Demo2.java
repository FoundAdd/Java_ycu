package cn.hy.ch6;

/*
编写程序模拟中国人、美国人、北京人体重、身高、行为。
除主类外，程序中有4个类：People、ChinaPeople、AmericanPeople和BeijingPeople类。要求如下：
（1）People类有double型成员变量：height和weight，
    以及public void speakHello()、public void averageHeight()和public void averageWeight()方法。
（2）ChinaPeople类是People类的子类，新增了public void chinaGongfu()方法。
     要求ChinaPeople重写父类的public void speakHello ()、public void averageHeight()和public void averageWeight()方法。
（3）AmericanPeople类是People的子类，新增public void americanBoxing()方法。
    要求AmericanPeople重写父类的public void speakHello()、public void averageHeight()和public void averageWeight()方法。
（4）BeijingPeople类是ChinaPeople的子类，新增public void beijingOpera()方法。
    要求BeijingPeople重写父类的public void speakHello()、public void averageHeight()和public void averageWeight()方法。
编写一个测试程序，打印出中国人、美国人、北京人的平均的身高和体重，并输出他们的不同行为。
 */
public class Ch6Demo2 {
    public static void main(String[] args) {
        ChinaPeople chinaPeople = new ChinaPeople();
        AmericanPeople americanPeople = new AmericanPeople();
        BeijingPeople beijingPeople = new BeijingPeople();

        chinaPeople.chinaGongfu();
        chinaPeople.speakHello();
        chinaPeople.averageHeight();
        chinaPeople.averageWeight();

        System.out.println("---------------------");

        americanPeople.americanBoxing();
        americanPeople.speakHello();
        americanPeople.averageHeight();
        americanPeople.averageWeight();

        System.out.println("---------------------");

        beijingPeople.chinaGongfu();
        beijingPeople.beijingOpera();
        beijingPeople.speakHello();
        beijingPeople.averageHeight();
        beijingPeople.averageWeight();
    }
}

class People{
    private double height;
    private double weight;

    public void speakHello(){
        System.out.println("People speak Hello");
    }

    public void averageHeight(){
        System.out.println("People averageHeight is 170cm");
    }

    public void averageWeight(){
        System.out.println("People averageWeight is 60kg");}
}

class ChinaPeople extends People{
    public void chinaGongfu(){
        System.out.println("All Chinese can do kongfu ");
    }

    @Override
    public void speakHello() {
        System.out.println("Chinese speak hello");
    }

    @Override
    public void averageHeight() {
        System.out.println("Chinese averageHeight is 170cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("Chinese averageHeight is 60kg");
    }
}

class AmericanPeople extends People{
    public void americanBoxing(){
        System.out.println("American corpses can vote");
    }

    @Override
    public void speakHello() {
        System.out.println("American speak hello");
    }

    @Override
    public void averageHeight() {
        System.out.println("American averageHeight is 170cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("American averageHeight is 60kg");
    }
}

class BeijingPeople extends ChinaPeople{
    public void beijingOpera(){
        System.out.println("All of the people in Beijing can sing Beijing Opera");
    }

    @Override
    public void speakHello() {
        System.out.println("Beijing people speak hello");
    }

    @Override
    public void averageHeight() {
        System.out.println("Beijing people averageHeight is 170cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("Beijing people averageHeight is 60kg");
    }
}