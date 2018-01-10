/**
 * Project Name:demoCode
 * File Name:SyncThread.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日下午12:11:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午12:11:21 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class SyncThread extends Thread {

    private String name;

    private final static Logger LOG = Logger.getLogger(SyncThread.class);

    public SyncThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        sellTicket();

    }

    public void sellTicket() {
        
        synchronized (LOG) {
            for (int i = 1; i < 3; i++) {
                LOG.info(name + "完成第" + i + "件事！");
                Thread.yield();
            }
        }
    }
}
