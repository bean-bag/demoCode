/**
 * Project Name:demoCode
 * File Name:Pet.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午3:11:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;
/**
 * Description:   <br/>
 * Date:     2017年12月28日 下午3:11:00 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Pet {
    
    public Pet(){
        this.gender='母';
    }

    public Pet(int age){
        this.age = age;
        
        this.gender = '公';
    }
    String name;
    
    private int age; 
    
    private char gender;
    
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 没有指定访问修饰符，用默认的访问修饰符
     * 
     * friendly
     * Description: <br/>
     *
     * @author junwen.bao
     * @return
     */
    private char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}

