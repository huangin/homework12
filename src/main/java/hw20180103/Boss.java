/**
 * Project Name:dt59homework
 * File Name:Boss.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:11:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:11:12 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
// 老板类
public class Boss implements Computer {
    // 重写方法
    public void internet() {
        System.out.println("开一场会议");
    }

    @Override
    public void chatting() {

        System.out.println("和客户聊天");

    }
}
