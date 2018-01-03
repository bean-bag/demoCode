/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午2:41:51
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午2:41:51 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public abstract class Car {
    private String type;
    private String color;
    public Car(){
        System.out.println("开走！");       
    }   
    public void summary(){
       System.out.println("这是一辆车！");
    }
 
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}

