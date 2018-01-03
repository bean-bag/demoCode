/**
 * Project Name:demoCode
 * File Name:TestPet2.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月2日上午11:35:47
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 上午11:35:47 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestPet2 {

    public static void main(String[] args) {

       Pet pet1  = new Cat();
       
       Pet pet2 = new Dog();
       
       pet1.play();//类的方法形态不一样
       pet2.play();
       
       System.out.println("猫》》》健康值："+pet1.getHealth()+"\t 亲密度："+pet1.getLove());
       System.out.println("狗》》》健康值："+pet2.getHealth()+"\t 亲密度："+pet2.getLove());
    }

}

