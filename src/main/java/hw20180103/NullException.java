/**
 * Project Name:dt59homework
 * File Name:NullException.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:03:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:03:21 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
// 问题：编写一个空指针异常代码，并用try和catch处理
public class NullException {
    // 不懂
    private final static Logger LOG = Logger.getLogger(NullException.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LOG.info("日志输出");// 不懂

        while (true) {
            // 尝试在下面的范围内
            try {
                int n = sc.nextInt();
                System.out.println("输入有效");
                // 抓住异常
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("请重新输入");
            }
            break;
        }
        sc.close();
    }

}
