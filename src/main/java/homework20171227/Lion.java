/**
 * Project Name:dt59homework
 * File Name:Lion.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午4:21:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * 问题：定义一个狮子类，三种属性，三种构造方法， 在测试类中用三种方式构造类的实例对象 Description: <br/>
 * Date: 2017年12月27日 下午4:21:39 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Lion {
    String name;

    int age;

    char gender;

    // 无参构造方法
    public Lion() {
        System.out.println("宠物信息：");
    }

    // 一种参数构造方法
    public Lion(String name1) {
        // 名字不同的时候，可以不用this修饰
        name = name1;
    }

    // 三种参数构造方法
    public Lion(String name, int age, char gender) {
        // 构造方法里面的参数名字如果与类属性名相同，必须用this修饰
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
