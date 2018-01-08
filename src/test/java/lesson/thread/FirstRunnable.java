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
public class FirstRunnable implements Runnable {
    private final static Logger LOG = Logger.getLogger(FirstRunnable.class);

    private int name;

    public FirstRunnable(int name) {
        this.name = name;
    }

    @Override
    public void run() {
        
        LOG.info("The " + name + " runnable is running.");
        if(name%2==0){
            //Thread.yield();
            try {
                Thread.sleep(1000);
                LOG.info("The " + name + " runnable is sleep.");
            } catch (InterruptedException e) {
                
                LOG.info("interrupted",e);
                
            }
        }
    }

}
