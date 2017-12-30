/**
 * Project Name:dt59homework
 * File Name:CarTest.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:46:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:46:50 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
// 测试抽象类Car
public class CarTest {
    public static void main(String[] args) {
        // 实例化一个对象
        Dolly dolly = new Dolly();
        Kcar kcar = new Kcar();
        // 访问小车类，并给属性赋值
        dolly.setName("兰博基尼");
        // 访问子类的其他属性
        dolly.setColor("红色");
        kcar.setName("大卡车");
        kcar.setSpeed(100);
        kcar.setFly(false);
        dolly.summary();
        dolly.print();
        kcar.summary();
        kcar.print();

    }
}
