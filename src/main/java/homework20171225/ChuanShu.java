/**
 * Project Name:dt59homework
 * File Name:VipPrice.java
 * Package Name:Homework20171225
 * Date:2017年12月25日下午5:01:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:01:07 <br/>
 * 
 * @author huangjin
 * @version
 * @see 问题： 编写一个方法，传入两个数值，返回较大的一个值；
 */
public class ChuanShu {

    public int num(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return a;

        } else {
            System.out.println(b);
            return b;
        }

    }

    // 类方法

    public static void main(String[] args) {
        ChuanShu cs = new ChuanShu();
        // 调用方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = sc.nextInt();
        System.out.println("请输入一个数：");
        int b = sc.nextInt();
        cs.num(a, b);

    }

}
