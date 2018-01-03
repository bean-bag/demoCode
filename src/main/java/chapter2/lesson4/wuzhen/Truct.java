/**
 * Project Name:dt59homework
 * File Name:Truct.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:09:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4.wuzhen;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:09:04 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Truct extends Car {
    
    
    public Truct() {
        
        super("","");
        
    }

    private String size;

    public void summary() {
        System.out.println("这是一辆卡车！");

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        super.setType("this." + type);
    }

    public void print(String color, String type) {
        // super 直接调用的父级的方法
        // this 先在类找对应的方法，找到就直接执行；没找到，去父类中找；

        super.setColor(color);// 此处调用父类的type,调用不了,不明为什么？难道因为在SmallCar里面调用过么？
        super.setType(type);

        System.out.println("这是一辆" + getColor() + getType() + size + "的卡车！");
    }
}
