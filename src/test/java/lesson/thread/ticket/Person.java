/**
 * Project Name:demoCode
 * File Name:Person.java
 * Package Name:lesson.thread.ticket
 * Date:2018年1月7日下午5:11:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread.ticket;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午5:11:11 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Person {

    private String name;

    private int num;
    
    private int interval;

    public Person(String name,int interval) {
        this.name = name;
        this.interval = interval;
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

    public int getInterval() {
        return interval;
    }

}
