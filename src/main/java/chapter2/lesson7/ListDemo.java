/**
 * Project Name:demoCode
 * File Name:ListDemo.java
 * Package Name:chapter2.lesson7
 * Date:2018年1月4日上午10:30:39
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson7;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 上午10:30:39 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ListDemo {
    private final static Logger LOG = Logger.getLogger(ListDemo.class);
    public static void main(String[] args) {

        List list = new ArrayList();//长度是10
        //容量的长度为10
        /*=== 1) ===*/
        list.add("");
        
        list.add(1);
        list.add(true);
        list.add("s");
        
        
        for(int i=0;i<10;i++){
            list.add(i);
        }
        /*=== 2) ===*/
        //3;元素的个数
        int size = list.size();
        
        LOG.info("元素的个数:"+size);
        /*=== 3) ===*/
        list.add(1, null);//在索引为1（第二个）的位置插入数据“1111”
        list.add(1, null);
        LOG.info("元素新的个数:"+ list.size());
        
        /*=== 4) ===*/
        Object obj2 = list.get(1);
        
        Object obj3 = list.get(2);
        
        
        LOG.info("第2元素的值:"+obj2);
        
        LOG.info("第3元素的值:"+obj3);
        
        /// instanceof 
        /*=== 5) ===*/
        int idx1 = list.indexOf("abc");
        
        int idx2 = list.indexOf("1111");
        
        
        
        LOG.info("abc在此列表中的脚标（索引值）："+idx1);
        LOG.info("1111在此列表中的脚标（索引值）："+idx2);
        
    }

}

