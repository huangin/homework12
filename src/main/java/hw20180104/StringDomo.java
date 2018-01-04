/**
 * Project Name:dt59homework
 * File Name:StringDomo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:47:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:47:19 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class StringDomo {
    private final static Logger LOG = Logger.getLogger(StringDomo.class);

    public static void main(String[] args) {
        // String 类代表字符串，String 对象是不可变的，所以可以共享。
        String str = "字符串";
        LOG.info(str);
        // 等同于下面,如果两个str同时使用，会报错
        // char[] lol = { '字', '符', '串' };
        // String str = new String(lol);

        // 返回值为boolean，判断str中是否包含字符串“字”；
        Boolean str1 = str.contains("字");
        LOG.info(str1);

        // 返回指定索引处的 char 值
        char str2 = str.charAt(2);
        LOG.info(str2);

        // 判断字符字符串str是否为空
        Boolean str3 = str.isEmpty();
        LOG.info(str3);

        // 字符串的长度
        int str4 = str.length();
        LOG.info(str4);

        // 返回此对象本身（它已经是一个字符串！）。
        String str5 = str.toString();
        LOG.info(str5);

        // 判断str是否与指定的字符串相同
        Boolean str6 = str.equals("赵日天");
        LOG.info(str6);

        // 新字符替换旧字符
        String str7 = str.replace("字符串", "天下无敌");
        LOG.info(str7);

    }
}
