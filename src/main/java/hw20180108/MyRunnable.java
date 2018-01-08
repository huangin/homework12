/**
 * Project Name:DOMO
 * File Name:Myrunnable.java
 * Package Name:ThreadDOMO
 * Date:2018年1月8日下午2:52:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午2:52:08 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
/*
 * 方式2：实现Runnable接口创建线程
 */
public class MyRunnable implements Runnable {
    private int num;

    public MyRunnable() {
    }

    public MyRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
