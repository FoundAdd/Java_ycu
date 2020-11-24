package cn.hy.ch6;

/*
������Instrument����Ϊ���٣�piano��С����(violin)��
���ǵĵ��෽����play����ͬ����д������InstrumentTest��
Ҫ�󣺱�д����testPlay,���������������е�����ԡ��ýӿ�ʵ��
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
        System.out.println("������");
    }
}

class Violin implements Instrument{
    @Override
    public void play() {
        System.out.println("��С����");
    }
}
