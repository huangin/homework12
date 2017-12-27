/**
 * Project Name:dt59homework
 * File Name:Ball.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午5:43:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * 10.6. 编写一个类，定义两个属性， 其中一个属性前添加static关键字； 再定义两个方法，其中一个方法前添加static关键字；
 * Description: <br/>
 * Date: 2017年12月27日 下午5:43:49 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Ball {
    // 姓名
    static String name;

    // 形状
    char xing;

    public static void getName() {
        name = "篮球";
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;

    }

    public char getXing() {
        return xing;
    }

    public void setXing(char xing) {
        this.xing = xing;
    }
}
