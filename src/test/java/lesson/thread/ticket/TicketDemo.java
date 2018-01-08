/**
 * Project Name:demoCode
 * File Name:TicketDemo.java
 * Package Name:lesson.thread.ticket
 * Date:2018年1月7日下午5:21:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread.ticket;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午5:21:07 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TicketDemo {

    public static void main(String[] args) {

        TicketDB db = new TicketDB(10);
        Person[] persons = new Person[] { 
                new Person("小明",500), 
                new Person("黄牛",400), 
                new Person("代理",300) };

        for (Person p : persons) {
            new TicketAgent(db, p).start();
        }

    }

}
