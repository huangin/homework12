/**
 * Project Name:dt59homework
 * File Name:phone.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:46:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:46:56 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
/**
 * 手机类实现电脑类，Call类的功能；
 */
public class Phone implements Computer, Call {

    @Override
    public void message() {

        System.out.println("给客户打电话");

    }

    @Override
    public void internet() {

        System.out.println("用" + NAME + "上网和客户沟通");

    }

    @Override
    public void chatting() {

        System.out.println("谈生意谈人生谈理想。。。。。");

    }

}
