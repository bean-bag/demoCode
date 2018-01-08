/**
 * Project Name:demoCode
 * File Name:FirstRunnable.java
 * Package Name:lesson.thread
 * Date:2018年1月7日上午11:02:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 上午11:02:00 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class SyncDemo implements Runnable {
    private final static Logger LOG = Logger.getLogger(SyncDemo.class);

    private static int val = 0;
    private int name;

    public SyncDemo(int name) {
        this.name = name;
    }
    @Override
    public void run() {
        
        synchronized(this)
        {
            val++;
        }
        LOG.info("The " + name + " :　"+val+" runnable is running.");
    }

}
