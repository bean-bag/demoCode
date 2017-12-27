/**
 * Project Name:demoCode
 * File Name:Pet.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月26日上午11:34:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;

/**
 * Description: <br/>
 * Date: 2017年12月26日 上午11:34:26 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Pet {

    private String name;

    /**
     * age>0;
     */
    private int age;
    
//    void fuzhiName(String name){
//        
//    }
    /**
     * 赋值的方法：set + 属性名<br>
     * 取值的方法：get + 属性名<br>
     * Description: <br/>
     *
     * @author junwen.bao
     * @param age
     */
    void setAge(int age){
        if(age>0){
            this.age = age;
        }
    }
    
    int getAge(){
        return age;
    }
    
}
