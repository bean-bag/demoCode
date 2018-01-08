/**
 * Project Name:demoCode
 * File Name:TicketBox.java
 * Package Name:chapter2.lesson9.ticket
 * Date:2018年1月8日上午11:30:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9.ticket;
/**
 * Description:  票箱 <br/>
 * Date:     2018年1月8日 上午11:30:58 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TicketBox {

    private int num;
    
    

    /**
     * 定义票的数量
     * Creates a new instance of TicketBox.
     *
     * @param num
     */
    public TicketBox(int num) {
        this.num = num;
    }

    /**
     * 查询票有多少张
     * Description: <br/>
     *
     * @author junwen.bao
     * @return
     */
    public int query() {
        return num;
    }

    /**
     * 
     * Description: 卖票的接口<br/>
     *
     * @author junwen.bao
     * @param num
     */
    public void sell(int num) {
        this.num = num;
    }
    
    
}

