package cn.hy.ch6;

/*
乐器（Instrument）分为钢琴（piano）小提琴(violin)，
他们的弹奏方法（play）不同，编写测试类InstrumentTest，
要求：编写方法testPlay,对这两种乐器进行弹奏测试。用接口实现
 */
class InstrumentTest{
    public static void main(String[] args) {
        testPlay();
    }
    public static void testPlay(){
        Instrument piano = new Piano();
        Instrument violin = new Violin();

        piano.play();
        violin.play();
    }
}
public class Ch6Demo1 {

}

interface Instrument{
    void play();
}

class Piano implements Instrument{
    @Override
    public void play() {
        System.out.println("弹钢琴");
    }
}

class Violin implements Instrument{
    @Override
    public void play() {
        System.out.println("拉小提琴");
    }
}
