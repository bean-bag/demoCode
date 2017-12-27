/**
 * Project Name:demoCode
 * File Name:DogCaller.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月26日上午10:17:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;

/**
 * Description: <br/>
 * Date: 2017年12月26日 上午10:17:37 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class DogCaller {

    public static void main(String[] args) {
        String name = "abc";
        int color = 1;
        Dog dog = new Dog();
        //Dog.kind = "猫科";
        String kind = Dog.kind;
        
        System.out.println(kind);
       dog.eat();
       
        //Dog.showAge();
//        Dog dog = new Dog(name, color);
//
//        Dog dog1 = new Dog(color, name);

    }

}
