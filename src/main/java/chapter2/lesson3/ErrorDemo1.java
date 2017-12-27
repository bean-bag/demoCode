/**
 * Project Name:demoCode
 * File Name:ErrorDemo1.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日上午9:30:56
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 上午9:30:56 <br/>
 * 
 * 1、定义方法时，方法的小括号中，才有类型申明，此时的参数是形参<br> 
 * 2、调用方法时，方法的小括号中，不能有类型申明 此时的参数是实际参数，需要实实在在的数据值<br>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ErrorDemo1 {
    //1。成员变量写在一起；
    private String name;

    private int age;
    
    //2。构造方法
    public ErrorDemo1(String name) {
        //this.name = name;
        //直接写数据值 ：常量
        this(name,0/*int age =0*/);
        //调用时；对应的参数，就是实参数
    }
    

    public ErrorDemo1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    //3。普通方法
    
}

