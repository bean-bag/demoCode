/**
 * Project Name:dt59homework
 * File Name:Truct.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:09:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午4:09:04 <br/>
 * 
 * @author Wu zhen
 * @version
 * @see
 */
public class Truct extends Car {
    private String size;

    public void summary() {
        System.out.println("这是一辆卡车！");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size1) {
        this.size = size1;
    }

    public void print(String color, String type) {
        super.setColor(color);// 此处调用父类的type,调用不了,不明为什么？难道因为在SmallCar里面调用过么？
        this.setType(type);
        System.out.println("这是一辆z" + getColor() + getType() + size + "的卡车！");        
    }
}
