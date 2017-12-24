/**
 * Project Name:dt59homework
 * File Name:Tiger.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午2:01:42
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月24日 下午2:01:42 <br/>
 * 
 * @author ASUS
 * @version
 * @see
 */
public class Tiger {
    // 老虎的属性
    String name;

    String color;

    int age;

    char gender;

    void message() {
        System.out.println("姓名:" + name + "\n皮肤:" + color + "\n年龄:" + age + "\n性别:" + gender);

    }

    // 跑方法
    void run() {
        System.out.println("正在以0.1m/s的速度向前奔跑");
    }

    // 叫方法
    void cry() {
        System.out.println("嗷嗷");
    }

    // 吃方法
    void eat() {
        System.out.println("爱吃牛肉");
    }

    public static void main(String[] args) {
        // 创建对象,语法：类名 对象名=new 类名();
        Tiger paper = new Tiger();
        // 给属性赋值
        paper.name = "辛巴";
        paper.color = "棕色";
        paper.age = 3;
        paper.gender = '雄';
        // 调用方法,语法:对象名.方法名();
        paper.message();
        System.out.println("***********************");
        paper.run();
        paper.cry();
        paper.eat();

    }

}
