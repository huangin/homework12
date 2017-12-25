/**
 * Project Name:dt59homework
 * File Name:VipPrice.java
 * Package Name:homework20171225
 * Date:2017年12月25日下午6:10:05
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package homework20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午6:10:05 <br/>
 * 
 * @author huangjin
 * @version B)
 *          编写一个vip卡片类，定义vip等级属性，定义结算方法；结算方法传入购物金额，返回折扣后金额。结算方法处理逻辑：根据viP等级属性，
 *          给予不同打折优惠。 至尊级：7.5 钻石级：8 铂金级：8.5 黄金级：9 白银级：9.5
 * 
 * @see
 */
public class VipPrice {
    // 等级属性
    String level1 = "至尊级：7.5";

    String level2 = " 钻石级：8";

    String level3 = " 黄金级：9 ";

    String level4 = "铂金级：8.5";

    String level5 = "白银级：9.5";

    // 结算方法

    public double pay(String string, double money) {

        if ("至尊级".equals(string)) {
            money = money * 0.75;
            System.out.println("折扣后金额：" + money);
        }
        if ("钻石级".equals(string)) {
            money = money * 0.8;
            System.out.println("折扣后金额：" + money);
        }
        if ("黄金级 ".equals(string)) {
            money = money * 0.85;
            System.out.println("折扣后金额：" + money);
        }
        if ("铂金级".equals(string)) {
            money = money * 0.9;
            System.out.println("折扣后金额：" + money);
        }
        if ("白银级".equals(string)) {
            money = money * 0.95;
            System.out.println("折扣后金额：" + money);
        }

        return money;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入购物金额：");
        double money = input.nextDouble();
        System.out.println("请输入vip等级：");
        String string = input.next();
        // 创建对象
        VipPrice jg = new VipPrice();
        jg.pay(string, money);

    }
}
