/**
 * Project Name:DOMO
 * File Name:MyscoreThreadTest.java
 * Package Name:ThreadDOMO
 * Date:2018年1月8日下午4:15:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:15:10 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
/*
 * 设置线程优先级
 */
public class MyscoreThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            Thread t1 = new Thread(new MyscoreThread(i), "线程A");
            t1.start();
            if (i == 100) {
                t1.setPriority(Thread.MAX_PRIORITY);
                System.out.println("设置最高优先级" + i);
            } else if (i == 0) {
                t1.setPriority(Thread.MIN_PRIORITY);
                System.out.println("设置最低优先级" + i);
            } else {
                t1.setPriority(Thread.NORM_PRIORITY);
                System.out.println("设置默认优先级" + i);
            }
        }

    }
}
