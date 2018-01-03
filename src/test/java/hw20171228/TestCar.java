/**
 * Project Name:dt59homework
 * File Name:TestSmallCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午4:23:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午4:23:12 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class TestCar {

    public static void main(String[] args) {
       
        Car sc=new SmallCar("丰田",7,"SUV","黑色");
     
        sc.summary();   //在SmallCar里面重写这个，可以直接调用，输出结果是重写后的结果；                
        
        Truct truct=new Truct();       
        truct.summary();
        truct.setSize("超大型的");
        truct.print("白色","载货");
        
    }
    
}

