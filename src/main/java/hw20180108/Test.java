/**
 * Project Name:DOMO
 * File Name:Test.java
 * Package Name:ThreadDOMO
 * Date:2018年1月8日下午2:17:59
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午2:17:59 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Test {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        MyThread my3 = new MyThread();
        my1.start();// 启动线程1
        my2.start();// 启动线程2
        my3.start();// 启动线程3
        // 1.只有主线程一条执行路径 2.依次调用了3次run()方法；
        // my.run();
        // my1.run();
        // my2.run();

    }
}
