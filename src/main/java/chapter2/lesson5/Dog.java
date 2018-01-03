/**
 * Project Name:demoCode
 * File Name:Dog.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月2日上午9:52:29
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;

/**
 * Description: <br/>
 * Date: 2018年1月2日 上午9:52:29 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Dog extends Pet {

    private String name;

    private String food;

    public Dog(String name) {

        this.name = name;
    }

    public Dog() {

        // Auto-generated constructor stub

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // @Override
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if ("骨头".equals(food)) {// 做比较时：常量放左边
            this.food = food;
        }
    }

    @Override
    public void play() {
        this.setHealth(this.getHealth() - 20);
        this.setLove(this.getLove() + 5);

    }

}
