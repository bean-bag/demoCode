/**
 * Project Name:demoCode
 * File Name:DateDemo.java
 * Package Name:chapter2.lesson8
 * Date:2018年1月6日上午10:37:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson8;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 上午10:37:51 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class DateDemo {
    private final static Logger LOG = Logger.getLogger(DateDemo.class);

    public static void main(String[] args) {

        // 月份，需要减1；
        Date date = new Date(2018 - 1900, 1 - 1, 6);

        LOG.info("今天是：" + date);
        // 格式化
        // 格式化的模板
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss.SSSZ");
        String strDate = SDF.format(date);

        LOG.info("今天是：" + strDate);
        
        
        //1970年，一月一号 0点，0分0秒0毫秒
        Date date2 = new Date(0);
        
        LOG.info("new Date(0)是：" + SDF.format(date2));

        long cur = System.currentTimeMillis();
        
        //当前时间
        Date date3 = new Date(cur);
        
        LOG.info("当前时间是：" + SDF.format(date3));

        
    }
}
