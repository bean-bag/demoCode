/**
 * Project Name:demoCode
 * File Name:HashMapDemo.java
 * Package Name:chapter2.lesson7
 * Date:2018年1月4日下午12:06:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午12:06:52 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class HashMapDemo {
    private final static Logger LOG = Logger.getLogger(HashMapDemo.class);
    public static void main(String[] args) {

       Map map =  new HashMap();
       
       LOG.info("map的长度：" + map.size());
       
       map.put("123", "abc");
       map.put("124", "abc");
       map.put("125", "abc");
       
       //Map中的key，不能重复
       
       LOG.info("map的长度：" + map.size());
       LOG.info("123对应的值："+map.get("123"));
       //LOG.info("123对应的值："+map.get(1));---没有索引方法
       
       Iterator ite = map.keySet().iterator();
       
       while(ite.hasNext()){
           LOG.info(ite.next());
       }
    }

}

