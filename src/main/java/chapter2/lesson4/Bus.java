/**
 * Project Name:demoCode
 * File Name:Bus.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午5:06:24
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午5:06:24 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Bus extends Car {
    Bus(int site) {
        setSite(site);
    }
    
    /**
     * 重写
     *
     * @see chapter2.lesson4.Car#print()
     */
    public Bus print(){       
        System.out.print("巴士 载客量是" + this.getSite() + "人");
        return null;
    }
}
