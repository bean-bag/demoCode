/**
 * Project Name:demoCode
 * File Name:TicketDB.java
 * Package Name:lesson.thread.ticket
 * Date:2018年1月7日下午5:02:06
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread.ticket;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午5:02:06 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TicketDB {
    private int num = 10;

    public TicketDB(int num) {
        this.num = num;
    }

    /**
     * 获取余票数
     * Description: <br/>
     *
     * @author junwen.bao
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     * 更新余票数
     * Description: <br/>
     *
     * @author junwen.bao
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

}
