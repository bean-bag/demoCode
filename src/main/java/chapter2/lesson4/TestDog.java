/**
 * Project Name:demoCode
 * File Name:TestDog.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午3:16:05
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;
/**
 * Description:   <br/>
 * Date:     2017年12月28日 下午3:16:05 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestDog {

    public static void main(String[] args) {

       Dog dog = new Dog();
       
       //dog.setGender('公');
       
       dog.setName("小黄");
       
       dog.setKind("犬科");
       
       dog.setVoice("汪汪");
       
       
       System.out.println(dog.getKind());
       
       
       System.out.println(dog.getVoice());
       

    }

}

