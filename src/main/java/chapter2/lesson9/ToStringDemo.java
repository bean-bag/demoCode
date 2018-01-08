/**
 * Project Name:demoCode
 * File Name:ToStringDemo.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午9:08:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

import org.apache.log4j.Logger;


/**
 * Description:   <br/>
 * Date:     2018年1月8日 上午9:08:25 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ToStringDemo {
    private final static Logger LOG = Logger.getLogger(ToStringDemo.class);

    public static void main(String[] args) {
        DemoBean db = new DemoBean("张三",25); 
        LOG.info(db);//对象的打印输出，会调用toString()
        LOG.info(db.toString());//如果不用Object.toString()方法，可以重写此方法；
    }
}

