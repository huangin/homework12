/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午10:32:03
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午10:32:03 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 *
 *      1.父类没有必要实例化，采取将父类定义成抽象类型 语法：public abstract class 类名 2.抽象类中未必都是抽象方法
 *      但是抽象方法一定是要在抽象类中 父类中定义方法，必须由子类实现，每个子类实现的内容不同（方法体），此时采取父类定义抽象方法
 *
 */
public abstract class Car {
    // 3.抽象方法没有方法体，因为没有必要有，抽象方法必须由子类全部实现；
    // 如果加了abstract就是抽象方法，大括号里不能有方法体，即输出信息；
    // 车型

    private String name;

    // 马力
    private int speed;

    public Car() {
        this.name = "汽车";
        this.speed = 200;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void summary() {

        System.out.println("我是：" + this.name);
        System.out.println("速度：" + this.speed);
    }

}
