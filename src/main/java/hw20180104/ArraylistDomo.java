/**
 * Project Name:dt59homework
 * File Name:ArrayList.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午5:03:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午5:03:27 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class ArraylistDomo {
    private final static Logger LOG = Logger.getLogger(ArraylistDomo.class);

    public static void main(String[] args) {
        List<String> lis = new ArrayList<String>();
        lis.add("金哥");
        lis.add("无敌吗");
        lis.add("能1v5吗");
        lis.add("超神");
        lis.add(2, "你说的一点没错");// 向索引指示的位置添加指定的项。
        LOG.info(lis);

        LOG.info(lis.contains("金哥")); // 是否包含“金哥”元素
        LOG.info("列表中的第4项：" + lis.get(4));// 获取选定列表中的项
        LOG.info("列表长度：" + lis.size());// 获取列表项的长度
        LOG.info(lis.remove(3));// 删除列表指定的项
        LOG.info("********************");
        // 遍历方式
        for (int i = 0; i < lis.size(); i++) {
            Object obj = lis.get(i);// 返回类型是Object,获取列表中的项
            LOG.info(obj);
        }
        LOG.info("********************");
        // 迭代器，遍历
        Iterator y = lis.iterator();// 为什么有警告？？？
        while (y.hasNext()) {

            LOG.info(y.next());
        }

    }
}
