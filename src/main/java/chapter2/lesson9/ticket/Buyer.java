/**
 * Project Name:demoCode
 * File Name:Buyer.java
 * Package Name:chapter2.lesson9.ticket
 * Date:2018年1月8日上午11:35:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9.ticket;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午11:35:55 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Buyer {
    /**
     * 买票人的名称
     */
    private String name;

    /**
     * 买了多少 张票
     */
    private int num;

    public Buyer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
