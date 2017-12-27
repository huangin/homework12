/**
 * Project Name:dt59homework
 * File Name:LionTest.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午4:22:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:22:00 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class LionTest {
    public static void main(String[] args) {
        // 无参构造方法不用加 "类名 对象名="
        new Lion();
        // 对象赋值的类型要与构造方法里面的参数类型一致
        Lion a = new Lion("狮子王");
        Lion c = new Lion("辛巴", 10, '男');
        System.out.println("身份：" + a.name);

        System.out.println("姓名：" + c.name + "\n年龄:" + c.age + "\n性别:" + c.gender);
    }
}
