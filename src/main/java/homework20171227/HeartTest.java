/**
 * Project Name:dt59homework
 * File Name:HeartTest.java
 * Package Name:workclass
 * Date:2017年12月27日下午5:34:01
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;


/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:34:01 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class HeartTest {

    public static void main(String[] args) {
        Heart heart = new Heart();
        heart.setColor("红色");
        heart.setAge(100);
        heart.setSport(true);
        System.out.println("我的心脏是：" + heart.getColor() + "\n它的使用年限是：" + heart.getAge() + "\n它会跳吗：" + heart.isSport());

    }

}
