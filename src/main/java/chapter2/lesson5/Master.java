/**
 * Project Name:demoCode
 * File Name:Master.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月2日上午10:37:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 上午10:37:02 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Master {

    private String name;

//    private Cat cat;
//    private Dog dog;
    private Pet pet;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * 认养一只猫
     * Description: <br/>
     *
     * @author junwen.bao
     * @param cat
     */
//    public void adopt(Cat cat){
//        this.cat = cat;
//    }
    
//    public void adopt(Dog cat){
//        this.dog = cat;
//    }
    
    public void adopt(Pet cat){
        this.pet = cat;//具体数据类型不同
    }

//    public Cat getCat() {
//        return cat;
//    }
//
//    public Dog getDog() {
//        return dog;
//    }

    public Pet getPet() {
        return pet;
    }
    
    public void feed(String food){
        //this.pet.
        if(this.pet instanceof Cat){//变量的形态不一样
            Cat tmp = (Cat)pet;
            tmp.setFoodFish(food);
        }else if(this.pet instanceof Dog){
            ((Dog)pet).setFood(food);
        }
    }    
    
}

