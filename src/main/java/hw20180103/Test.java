/**
 * Project Name:dt59homework
 * File Name:Test.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:26:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:26:44 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {
        // 接口类方法都是抽象方法，不能实例化，只能实例化子类；使用多态形式2：父类作引用类型，子类实例化
        Computer computer = new Boss();
        Computer computer2 = new Customer();
        computer.internet();
        computer.chatting();
        computer2.internet();
        computer2.chatting();
        System.out.println("*************");
        Phone phone = new Phone();
        phone.message();
        phone.internet();
        phone.chatting();

    }

}
