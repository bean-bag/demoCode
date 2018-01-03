/**
 * Project Name:demoCode
 * File Name:Cat.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月2日上午10:00:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 上午10:00:40 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Cat extends Pet {
    private String name;

    private String food;

    public Cat() {
        
    }
    
    public Cat(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFoodFish(String food/*null*/) {
        //if(food.equals("鱼")){
        if("鱼".equals(food)){//做比较时：常量放左边 
            this.food = food;
        }
    }

    @Override
    public void play() {        
        this.setHealth(this.getHealth() - 5);
        this.setLove(this.getLove() + 3);        
    }
    
    
}

