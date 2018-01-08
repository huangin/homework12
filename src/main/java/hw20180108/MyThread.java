/**
 * Project Name:DOMO
 * File Name:MyThread.java
 * Package Name:ThreadDOMO
 * Date:2018年1月8日上午11:23:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午11:23:44 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
/*
 * 方式1:继承Thread类的方式创建线程
 */
public class MyThread extends Thread {
    // 重写run()方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 获取当前线程名：i
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}
