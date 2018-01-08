/**
 * Project Name:DOMO
 * File Name:MyscoreThread.java
 * Package Name:ThreadDOMO
 * Date:2018年1月8日下午4:10:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:10:28 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class MyscoreThread extends Thread {
    private int score;// 分数

    public MyscoreThread() {

    }

    public MyscoreThread(int score) {
        this.score = score;
    }

    // 重写run()方法
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + score);
    }
}
