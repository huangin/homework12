/**
 * Project Name:DOMO
 * File Name:TestMyRunnable.java
 * Package Name:ThreadDOMO
 * Date:2018年1月8日下午3:10:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:10:30 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class TestMyRunnable {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            // 1.创建线程对象
            Runnable M = new MyRunnable(i);
            Thread t = new Thread(M);
            t.start();
        }

    }

}
