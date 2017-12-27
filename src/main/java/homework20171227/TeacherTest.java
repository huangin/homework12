/**
 * Project Name:dt59homework
 * File Name:TeacherTest.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午3:36:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:36:43 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class TeacherTest {

    public static void main(String[] args) {
        // 实例化类的对象
        Teacher a = new Teacher("黄老师", 20, '男');
        System.out.println("姓名：" + a.name + "\n年龄：" + a.age + "\n性别：" + a.gender);

    }
}
