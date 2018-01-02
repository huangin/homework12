/**
 * Project Name:dt59homework
 * File Name:Test.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午2:59:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:59:17 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Master master = new Master();
        master.feed(dog);// 喂养狗类，传入实参dog给父类形参pet
        master.feed(cat);// 喂养猫类，传入实参cat给父类形参pet

        // 多态形式2：父类做引用类型，子类实例化
        Pet pet = new Dog();// 子类转父类，自动转换
        pet.eat();// Dog向上转换为父类，访问的eat()方法为狗类的eat();
        master.play(dog);
        // 通过宠物喜欢的选择宠物
        System.out.println("请输入宠物喜欢的：“ball”或者“sleep”");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// 键盘接收一个字符串
        Master mas = new Master();// 实例化一个对象
        // 通过mas对象先访问getPet方法,再访问getPet里面的eat()方法
        mas.getPet(str).eat();

    }

}
