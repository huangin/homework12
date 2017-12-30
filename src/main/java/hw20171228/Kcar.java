/**
 * Project Name:dt59homework
 * File Name:kcar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:12:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:12:38 <br/>
 * @author   huangjin
 * @version
 * @see
 */
/**
 * 卡车类 Description: <br/>
 * date: 2017年12月29日 下午3:13:28 <br/>
 *
 * @author huangjin
 * @version
 */
// 卡车类
public class Kcar extends Car {

    // 载重
    private int load;

    // 是否会飞
    private boolean fly;

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public boolean getFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void print() {
        System.out.println("我能载重：" + this.load);

        System.out.println("我会飞吗？" + this.fly);
    }
}
