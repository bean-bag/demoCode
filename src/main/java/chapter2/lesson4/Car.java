/**
 * Project Name:demoCode
 * File Name:Car.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午5:05:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午5:05:44 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Car {
    private int site = 4; // 座位数

    Car()  {
        //super.clone();
        System.out.println("car 载客量是" + site + "人");
    }

    public void setSite(int site) {
        this.site = site;
    }

    public int getSite() {
        return site;
    }

    Bus print() {
        System.out.print("car 载客量是" + site + "人");
        return null;
    }
}
