package cn.hy.ch2;

/*
编写程序，假设一个车牌号码由三个大写字母和后面的四个数字组成，
编程实现生成一个车牌号码并输出。
 */

import java.util.Random;

public class Ch2Demo8 {
    public static void main(String[] args) {
        createVehicleLicense();
    }

    private static void createVehicleLicense(){
        StringBuilder license = new StringBuilder();

        for (int i=0; i<7; i++){
            if (i<3) {
                license.append((char) random(65, 90));
            }
            else {
                license.append((char) random(48, 57));
            }
        }

        System.out.println(license);
    }

    private static int random(int min, int max){
        Random rd = new Random();
        return rd.nextInt(max) % (max-min+1)+min;
    }
}
