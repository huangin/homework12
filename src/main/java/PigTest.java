/**
 * Project Name:dt59homework
 * File Name:PigTest.java
 * Package Name:
 * Date:2017年12月28日下午3:23:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午3:23:43 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class PigTest {

    public static void main(String[] args) {

        Pig pig = new Pig();
        pig.setName("小黄人");
        pig.setGender('男');
        pig.setVoice("好的");
        System.out.println(pig.getName() + pig.getGender() + pig.getVoice());
    }

}
