/**
 * Project Name:dt59homework
 * File Name:DollyTest.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午5:19:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午5:19:47 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class DollyTest {

    public static void main(String[] args) {
        // 实例化一个对象
        Dolly dolly = new Dolly();
        Kcar kcar = new Kcar();
        // 如何继承父类属性，并且重新给属性赋值？
        dolly.setMoney("300w");
        dolly.setColor("红色");
        dolly.print();
        dolly.sumary();
        kcar.setLoad(10);
        kcar.setFly(false);
        kcar.print();

    }

}
