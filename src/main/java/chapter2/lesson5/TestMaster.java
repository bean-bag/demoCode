/**
 * Project Name:demoCode
 * File Name:TestMaster.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月2日上午10:43:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 上午10:43:47 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestMaster {

    public static void main(String[] args) {

        Master master= new Master();
        master.setName("王二麻");
        
        master.adopt(new Cat("王二麻的猫"));

        Master master1= new Master();
        master1.setName("张三");
        
        master1.adopt(new Dog("张三的狗"));
        
        master.feed("");
        
        if(master.getPet() instanceof Cat){//变量的形态不一样
            Cat tmp = (Cat)master.getPet();
            tmp.setFoodFish("");
        }else if(master1.getPet() instanceof Dog){
            ((Dog)master1.getPet()).setFood("");
        }
        
    }

}

