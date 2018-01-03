/**
 * Project Name:dt59homework
 * File Name:Computer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:07:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:07:32 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
// 接口类
public interface Computer {
    String NAME = "华硕";// 接口类中定义的变量为常量

    // 上网
    void internet();// 方法默认为抽象方法
    // 聊天

    void chatting();
}
