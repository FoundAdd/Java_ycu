package cn.hy.ch8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
编写程序Ch8Demo6，定义一个Map接口的集合，存入一些狗和狗的主人，
请按狗的年龄顺序输出集合中的狗对象及主人对象。
 */
public class Ch8Demo6{
    public static void main(String[] args) {
        Map<Ch8Demo1.Dog, Ch8Demo1.Person> map = new HashMap<>();

        Ch8Demo1.Dog dog1 = new Ch8Demo1.Dog("哈士奇", 6);
        Ch8Demo1.Dog dog2 = new Ch8Demo1.Dog("萨摩耶", 12);
        Ch8Demo1.Dog dog3 = new Ch8Demo1.Dog("阿拉斯加", 7);

        Ch8Demo1.Person person1 = new Ch8Demo1.Person("张三", 24);
        Ch8Demo1.Person person2 = new Ch8Demo1.Person("李四", 29);

        map.put(dog1, person1);
        map.put(dog2, person1);
        map.put(dog3, person2);

        Ch8Demo1.Dog[] dogs = new Ch8Demo1.Dog[3];
        int index = 0;
        for (Ch8Demo1.Dog tmp : map.keySet()) {
            dogs[index++] = tmp;
        }

        for(int i=0; i<dogs.length; i++) {
            for (int j=0; j<dogs.length-i-1; j++) {
                if (dogs[j].getiAge() > dogs[j + 1].getiAge()) {
                    Ch8Demo1.Dog temp = dogs[j+1];
                    dogs[j+1] = dogs[j];
                    dogs[j] = temp;
                }
            }
        }

        for (Ch8Demo1.Dog tmp : dogs) {
            System.out.println("狗：");
            System.out.println(tmp.toString());
            System.out.println("主人：");
            System.out.println(map.get(tmp));
            System.out.println("-----------------");
        }
    }
}