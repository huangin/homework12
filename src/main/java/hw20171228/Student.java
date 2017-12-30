/**
 * Project Name:dt59homework
 * File Name:Student.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午8:03:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午8:03:40 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Student extends Human {
    private String name;

    private String book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void watch() {
        this.name = "悟空";
        System.out.println("我是：" + this.name);
        System.out.println("用" + this.getEyes() + "看" + this.book);
    }
}
