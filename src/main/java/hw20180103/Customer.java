/**
 * Project Name:dt59homework
 * File Name:Customer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:27:18
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:27:18 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Customer implements Computer {

    @Override
    public void internet() {

        System.out.println("上网");

    }

    @Override
    public void chatting() {

        System.out.println("视频聊天");

    }

}
