/**
 * Project Name:demoCode
 * File Name:PetTest.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月26日上午11:35:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月26日 上午11:35:26 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class PetTest {

    public static void main(String[] args) {

        Pet pet = new Pet();
        
        int age = -100;
        
        pet.setAge(age);
        
        int age1 = pet.getAge();
        
        System.out.println(age1);

    }

}

