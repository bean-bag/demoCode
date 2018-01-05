/**
 * Project Name:demoCode
 * File Name:HashSetDemo.java
 * Package Name:chapter2.lesson7
 * Date:2018年1月4日上午11:47:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 上午11:47:06 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class HashSetDemo {
    private final static Logger LOG = Logger.getLogger(HashSetDemo.class);

    public static void main(String[] args) {

        Set set = new HashSet();
        int size = set.size();

        LOG.info("set的长度：" + size);
        set.add("11");

        size = set.size();
        LOG.info("set的长度：" + size);
        
        set.remove("11");
        
        LOG.info("set的长度：" + set.size());
        
        set.add("222");
        set.add(222);
        set.add(true);
        
        
        
        Iterator ite = set.iterator();
        
//        Object obj = ite.next();        
//        
//        LOG.info("取第一个值：" + obj);
//        
//        Object obj1 = ite.next();        
//        
//        LOG.info("取第一个值：" + obj1);
        
        for(int i=0;i<set.size();i++){
            LOG.info("取第"+(i+1)+"个值：" + ite.next());
        }
        
        int  i=1;
        //迭代器，只能遍历一次
        
        ite = set.iterator();
        while(ite.hasNext()){
            LOG.info("运行证明");
            LOG.info("取第"+(i++)+"个值：" + ite.next());
        }
    }

}
