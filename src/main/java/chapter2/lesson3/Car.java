/**
 * Project Name:demoCode
 * File Name:Car.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日上午10:53:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 上午10:53:04 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Car {
    
    String name;
    
    static String KIND;
    
    public static void main(String[] args) {

        System.out.println(Car.KIND);//访问静态变量        
        
        //System.out.println(Car.name);
        Car car = new Car();        
        System.out.println(car.name);//访问实例变量
    }

    
    public String getFullName(){
        return "车型："+KIND +"，车名：" +name;
    }
    
//    public static String printOut(){
//        return "车型："+KIND +"，车名：" +name;
//    }
}

