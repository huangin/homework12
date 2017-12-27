/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午2:57:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * 10.2. 编写一个类，定义几个属性，同时给属性赋值； 再定义一个无参数构造方法， 在构造方法中，首先输出各属性值到控制台， 再给属性赋值；观察输出值内容
 * 
 * Description: <br/>
 * Date: 2017年12月27日 下午2:57:31 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Cat {
    String name = "太阳";

    int age = 3;

    char gender = '男';

    public Cat() {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + gender);

        String name = "月亮";
        int age = 1;
        char gender = '女';
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

}
