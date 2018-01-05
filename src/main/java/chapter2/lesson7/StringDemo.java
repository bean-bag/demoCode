/**
 * Project Name:demoCode
 * File Name:StringDemo.java
 * Package Name:chapter2.lesson7
 * Date:2018年1月4日上午9:53:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson7;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 上午9:53:02 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class StringDemo {

    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {
        
        List list ;
        //int [] ary = new int[];---错误代码 ，未指定 数组长度；
        
        //数组的长度，希望是可变的
        
        int len = 5;
        int [] ary = new int[len];
        ary[0]=1;
        len = 6;
        int [] ary2 = new int[len];
        
        
        String str = " a bc ";

        String str2 = str.trim();
        LOG.info("[" + str + "]");
        LOG.info("[" + str2 + "]");

    }
}
