/**
 * Project Name:demoCode
 * File Name:PrimeThread.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午10:29:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:29:46 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class PrimeThread extends Thread {
    private final static Logger LOG = Logger.getLogger(PrimeThread.class);

    long minPrime;
    private String vip = "";

    public void setVip(String vip) {
        this.vip = vip;
    }

    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }
    
    public void run() {
        LOG.info("NO:" + vip+minPrime + "");
    }
}
