/**
 * Project Name:demoCode
 * File Name:Pet.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月2日上午9:51:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 上午9:51:36 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public abstract class Pet {
    
    private int love = 0;
    private int health =100;

    private String gender;

    
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public abstract String getFood();//提供抽象方法
    
    
    public abstract void play();
    
    public String eat(){
        return this.getFood();
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
}

