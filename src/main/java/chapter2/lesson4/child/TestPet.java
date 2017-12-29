/**
 * Project Name:demoCode
 * File Name:TestPet.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午4:08:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4.child;

import chapter2.lesson4.Pet;

/**
 * Description:   <br/>
 * Date:     2017年12月28日 下午4:08:16 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestPet {

    public static void main(String[] args) {

        Pet pet = new Pet();
        //1、默认访问修饰符（friendly），不在同一个包中，就不能访问
       // 1.1,protected修饰符,在不同包中，也不能访问
       //System.out.println(pet.getGender());
       //2、public 没有限制，随意访问 --
       pet.getAge();

    }

}

