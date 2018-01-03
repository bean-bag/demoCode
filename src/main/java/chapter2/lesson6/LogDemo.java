/**
 * Project Name:demoCode
 * File Name:LogDemo.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午8:25:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 上午8:25:36 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class LogDemo {
    
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {
        System.out.println("Helloworld!");
        
        LOG.info("日志输");
    }

}
