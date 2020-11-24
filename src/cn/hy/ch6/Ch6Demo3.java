package cn.hy.ch6;

/*
定义一个接口CanFly，描述会飞的方法public void fly();分别定义类飞机和鸟，实现CanFly接口。
定义一个测试类，测试飞机和鸟。
测试类中定义一个makeFly()方法，让会飞的事物飞起来。
然后在main方法中创建飞机对象和鸟对象，并在main方法中调用makeFly()方法，让飞机和鸟起飞。
 */
public class Ch6Demo3 {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Bird bird = new Bird();

        makeFly(plane);
        makeFly(bird);
    }

    public static void makeFly(CanFly canFly){
        canFly.fly();
    }
}

interface CanFly {
    public void fly();
}

class Plane implements CanFly{

    @Override
    public void fly() {
        System.out.println("Plane can fly");
    }
}

class Bird implements CanFly{

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
