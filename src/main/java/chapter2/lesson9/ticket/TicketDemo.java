/**
 * Project Name:demoCode
 * File Name:TicketDemo.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午11:15:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9.ticket;

/**
 * Description: <br/>
 * 谁买票：Buyer 谁卖票：Seller 票箱：TicketBox
 * 
 * 
 * 
 * 
 * 
 * 
 * Date: 2018年1月8日 上午11:15:50 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TicketDemo {

    public static void main(String[] args) {

        TicketBox box = new TicketBox(10);

        Buyer buyer = new Buyer("小明");
        Buyer yellow = new Buyer("黄牛");
        Buyer agent = new Buyer("携程");

        //for (int i = 0; i < 10; i++) {
            Seller seller = new Seller(box, buyer);
            seller.start();

            Seller seller1 = new Seller(box, yellow);
            seller1.start();

            Seller seller2 = new Seller(box, agent);
            seller2.start();
        //}
        
        

    }

}
