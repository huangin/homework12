/**
 * Project Name:dt59homework
 * File Name:HaoCar.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午4:46:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import hw20171228.Car;

;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:46:16 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
// 豪车类，继承抽象类Car
// 本来报错Car cannot be resolved to a type，将鼠标移到类名Car上，导入包（要继承的类所在的包）
public class HaoCar extends Car {
    private String color;

    private String zhong;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getZhong() {
        return zhong;
    }

    public void setZhong(String zhong) {
        this.zhong = zhong;
    }

    public void HaoCar() {
        super.getName();
        super.getSpeed();
    }

    public void print() {
        System.out.println("我是豪车");
        System.out.println("颜色：" + this.color);
        System.out.println("重量：" + this.zhong);
    }

    public void sumary() {
        System.out.println("我是：" + this.getName());
        System.out.println("速度：" + this.getSpeed());
    }
}
