/**
 * Project Name:demoCode
 * File Name:BinDemo.java
 * Package Name:chapter2.lesson8
 * Date:2018年1月6日上午8:31:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson8;

import org.apache.log4j.Logger;


/**
 * Description:   <br/>
 * Date:     2018年1月6日 上午8:31:06 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class BinDemo {
    private final static Logger LOG = Logger.getLogger(BinDemo.class);
    
    public static void main(String[] args) {

        int i=1;
        int j = 2;
        int k = i&j;
        // 0001
        // 0010
        //------
        // 0000
        LOG.info("&2="+k);
        // 0010
        // 0010  
        //------
        // 0010        
        LOG.info("2&2="+(2&2));
        int k1 = i|j;
        // 0001
        // 0010      
        //------
        // 0011        
        LOG.info("1|2="+k1);
        
        //位移操作
        
        int k2 = i<<8;
        int k3 = i>>1;
        //  0001
        //------
        //0 0010        
        
        LOG.info("i<<1="+k2);
        //  0001
        //------
        //   000 1        
        LOG.info("i>>1="+k3);
        
    }

}

