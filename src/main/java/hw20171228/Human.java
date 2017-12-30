/**
 * Project Name:dt59homework
 * File Name:Human.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午8:02:34
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午8:02:34 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public abstract class Human {
    private String eyes;

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    // 看书的方法
    public abstract void watch();
}
