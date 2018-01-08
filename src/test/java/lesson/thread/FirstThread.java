/**
 * Project Name:demoCode
 * File Name:FirstThread.java
 * Package Name:lesson.thread
 * Date:2018年1月7日上午10:51:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 上午10:51:56 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class FirstThread extends Thread {
    private final static Logger LOG = Logger.getLogger(FirstThread.class);

    private String name;

    public FirstThread(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        LOG.info(name + " Thread is running.");
    }
}
