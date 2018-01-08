/**
 * Project Name:demoCode
 * File Name:Seller.java
 * Package Name:chapter2.lesson9.ticket
 * Date:2018年1月8日上午11:38:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9.ticket;

import org.apache.log4j.Logger;

import chapter2.lesson9.PrimeThread;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午11:38:32 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Seller extends Thread {
    
    //加static 关键字后，该变量，在JVM中，只有一份；
    private final static Logger LOG = Logger.getLogger(Seller.class);

    private TicketBox box;

    private Buyer buyer;

    public Seller(TicketBox box, Buyer buyer) {
        this.box = box;
        this.buyer = buyer;
    }

    @Override
    public void run() {
        sell();
    }

    public void sell() {

        // 问票有多少张
        do {
            // 同步
            synchronized (box) {
                int num = box.query();// 9
                if (num == 0) {
                    LOG.info(buyer.getName() + " 票没了");
                    break;
                }
                // start
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // end
                // 票箱减一张票
                box.sell(num - 1);
            }
                // 买票的人，多了一张票
                buyer.setNum(buyer.getNum() + 1);

                LOG.info(buyer.getName() + "买到" + buyer.getNum() + "张票了");

            
        } while (true);
    }

}
