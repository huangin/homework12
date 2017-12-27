/**
 * Project Name:dt59homework
 * File Name:TestTypeDefaultValue.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午2:22:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:22:16 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class TestTypeDefaultValue {

    public static void main(String[] args) {
        TypeDefaultValue v = new TypeDefaultValue();
        // 方法1：先赋值再访问
        int a = v.i;
        System.out.println("整型默认返回值为：" + a);
        // 方法2：以下为直接访问类属性
        System.out.println("字符型默认返回值为：" + v.c);
        System.out.println("double型默认返回值为：" + v.d);
        System.out.println("float型默认返回值为：" + v.f);
        System.out.println("布尔型默认返回值为：" + v.flag);
        System.out.println("long型默认返回值为：" + v.l);
        System.out.println("字符串默认返回值为：" + v.string);
        System.out.println("数组默认返回值为：" + v.arr);
        System.out.println("byte型默认返回值为：" + v.b);
    }
}
