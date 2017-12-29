/**
 * Project Name:demoCode
 * File Name:Human.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午6:45:52
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;

/**
 * Description: <br/>
 * Date: 2017年12月28日 下午6:45:52 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public abstract class Human {

    private int eyes;

    private int hand;

    private int legs;

    public Human() {
        // super();
        this.eyes = 2;
        this.hand = 2;
        this.legs = 2;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public abstract void brain() ;

}
