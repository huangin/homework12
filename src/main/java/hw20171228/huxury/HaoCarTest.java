/**
 * Project Name:dt59homework
 * File Name:HaoCarTest.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午4:50:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:50:14 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class HaoCarTest {

    public static void main(String[] args) {

        // 实例化对象，访问父类
        HaoCar haocar = new HaoCar();
        haocar.setName("布加迪威龙");
        haocar.setSpeed(360);
        haocar.setColor("黄色");
        haocar.setZhong("1500kg");
        haocar.print();
        haocar.sumary();
    }

}
