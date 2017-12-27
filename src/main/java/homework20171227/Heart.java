/**
 * Project Name:dt59homework
 * File Name:Heart.java
 * Package Name:homework20171227
 * Date:2017年12月27日下午5:18:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171227;

/**
 * 每个属性前添加private修饰符； 为每个属性，添加get/set方法，方法前添加public修饰符 Description: <br/>
 * Date: 2017年12月27日 下午5:18:39 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Heart {
    private String color;

    private int age;

    private boolean sport;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

}
