/**
 * Project Name:demoCode
 * File Name:Dog1.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日下午12:08:56
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午12:08:56 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Dog1 {

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
    
    
    public String shout(){
        return voice;
    }


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
    
    
}

