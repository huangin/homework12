/**
 * Project Name:dt59homework
 * File Name:Dolly.java
 * Package Name:hw20171228
 * Date:2017年12月28日下午10:57:54
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午10:57:54 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
// 子类Dolly(小车)继承父类Car
public class Dolly extends Car {

    private String money;

    private String color;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // public Dolly(){
    // super();//调用父类构造方法，调用方法有什么作用，之后呢？
    // super.summary();//调用父类成员方法
    // }

    public void print() {

        super.summary();

        System.out.println("我值：" + this.money);
        System.out.println("我的颜色：" + this.color);
        System.out.println("**********************");
    }

    // 重写父类方法
    public void sumary() {
        super.setName("兰博基尼");
        System.out.println("车型：" + this.getName());
    }
}
