/**
 * Project Name:demoCode
 * File Name:Car.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月3日上午8:54:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 上午8:54:19 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public abstract class Car {
    
    private String name;

    private int site = 4;

    public abstract int getSite();

    public void setSite(int site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

