/**
 * Project Name:demoCode
 * File Name:TicketAgent.java
 * Package Name:lesson.thread.ticket
 * Date:2018年1月7日下午5:05:30
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread.ticket;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午5:05:30 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TicketAgent extends Thread {
    private final static Logger LOG = Logger.getLogger(TicketAgent.class);

    private TicketDB db;

    private Person person;

    public TicketAgent(TicketDB db, Person person) {
        this.setName(person.getName());
        this.db = db;
        this.person = person;
    }

    @Override
    public void run() {
        do {
            int num;
//            synchronized (TicketAgent.class) {
                num = db.getNum();
                if (num == 0) {
                    LOG.info(person.getName() + " 买到票数为：" + person.getNum());
                    break;
                }
//            }

            // LOG.info(person.getName() + " 准备查询数据库余票");
            LOG.info(person.getName() + " 查询到余票数为：" + num);

            person.setNum(person.getNum() + 1);

            LOG.info(person.getName() + " 买1张票\t票库余票数为：" + (num - 1));
            try {
                Thread.sleep(person.getInterval());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            db.setNum(num - 1);
            
        } while (true);
    }

}
