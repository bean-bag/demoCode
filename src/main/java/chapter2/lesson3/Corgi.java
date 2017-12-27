/**
 * Project Name:demoCode
 * File Name:Corgi.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日下午12:14:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午12:14:29 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Corgi {
    /**
     * 叫声
     */
    private String voice = "汪汪";
    
    /**
     * 亲密度
     */
    private int love = 3;
    
    /**
     * 食物
     */
    private String food = "骨头";
    
    /**
     * 品种
     */
    private String strain;
    /**
     * 有没有尾巴
     */
    private boolean tail;    
    
    
    public String getVoice() {
        return voice;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public int getLove() {
        return love;
    }
    public void setLove(int love) {
        this.love = love;
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getStrain() {
        return strain;
    }
    public void setStrain(String strain) {
        this.strain = strain;
    }
    public boolean isTail() {
        return tail;
    }
    public void setTail(boolean tail) {
        this.tail = tail;
    }
    
    
    
}

