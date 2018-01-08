/**
 * Project Name:demoCode
 * File Name:DemoBean.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午9:08:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午9:08:54 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class DemoBean {

    private String name;

    private int age;

    
    
    public DemoBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "DemoBean [name=" + name + ", age=" + age + "]";
    }
    
    
    

}
