/**
 * Project Name:demoCode
 * File Name:TestHuman.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午6:47:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;
/**
 * Description:   <br/>
 * Date:     2017年12月28日 下午6:47:58 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestHuman {

    public static void main(String[] args) {
        //Human human =  new Human();
        Human student = new Student();
        //student.setName("张三");
        //student.setId("1223324443433432");
        student.brain();
        //human.brain();
        //human.getEyes();
        //个性的信息，没有
        //个性的功能，没有
        
        Human itMan = new ITMan();
        itMan.brain();
        
    }

}

