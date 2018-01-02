/**
 * Project Name:dt59homework
 * File Name:Master.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午2:59:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:59:35 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
// 主人类
public class Master {
    // 多态的形式1：父类Pet做形参，子类做实参
    public void feed(Pet pet) {// 喂养宠物的方法
        pet.eat();
    }

    public void play(Pet pet) {
        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;// 向下转型，强制转换
            dog.ball();
        }
        if (pet instanceof Cat) {
            Cat cat = (Cat) pet;// 向下转型，强制转换
            cat.sleep();
        }
    }

    // 多态的形式3：父类作为方法返回值，子类实例化，类型自动转换
    public Pet getPet(String select) {
        Pet pet = null;// 无返回值之前，String类型可以设为初始值
        if (select.equals("ball")) {
            pet = new Dog();

        }
        if (select.equals("sleep")) {
            pet = new Cat();

        }
        return pet;// 返回值只有一个
    }
}