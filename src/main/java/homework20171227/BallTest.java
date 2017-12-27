/**
 * Project Name:dt59homework
 * File Name:BallTest.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午5:44:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:44:09 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball();
        // 类对象给类属性赋值
        ball.xing = '圆';
        // 通过类名可以给类属性赋值
        Ball.name = "足球";
        // 类名可以直接访问静态属性和静态方法
        Ball.getName();
        // 类对象也可以访问静态方法
        // ball.getName();
        System.out.println(ball.xing);
    }
}
