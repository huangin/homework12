/**
 * Project Name:dt59homework
 * File Name:Map_Domo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午7:24:22
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午7:24:22 <br/>
 * 
 * @author huangjin
 * @version
 * @see
 */
public class Map_Domo {
    private final static Logger LOG = Logger.getLogger(Map_Domo.class);

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("欧巴", "卡机嘛");
        map.put("谢谢", "再见");
        map.put("钥匙", "开锁");
        // 由key键获取对应的值
        LOG.info(map.get("欧巴"));
        // 返回此映射中的键-值映射关系数
        LOG.info(map.size());// 3对
        // 移除选中键映射关键的值
        LOG.info(map.remove("欧巴"));
        // 如果此映射未包含键-值映射关系，则返回 true
        LOG.info(map.isEmpty());

        LOG.info(null);
        // 遍历方式，迭代器
        Iterator iter = map.entrySet().iterator();// 不懂
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();// 得到关键字
            Object value = entry.getValue();// 得到值
            LOG.info(entry);
        }
    }
}
