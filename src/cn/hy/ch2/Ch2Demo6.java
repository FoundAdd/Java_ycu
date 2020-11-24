package cn.hy.ch2;

/*
编写程序，模拟抛硬币1000000次，统计出现正面和反面的次数。
 */

@SuppressWarnings("SameParameterValue")
public class Ch2Demo6 {
    public static void main(String[] args) {
        coin(1000000);
    }

    private static void coin(int times){
        int a = 0;
        int b = 0;

        for (int i=0; i<times; i++){
            int tmp = (int) Math.floor(Math.random()*2);
            if (tmp == 0){
                a++;
            }
            else {
                b++;
            }
        }

        System.out.println(b - a);

        System.out.println("正面次数为：" + a + "次");
        System.out.println("反面次数为：" + b + "次");
    }
}
