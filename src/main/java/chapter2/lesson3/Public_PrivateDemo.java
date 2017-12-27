/**
 * Project Name:demoCode
 * File Name:Public_PrivateDemo.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日上午10:08:13
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;

/**
 * Description: <br/>
 * Date: 2017年12月27日 上午10:08:13 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Public_PrivateDemo {

    // public 公有的，可以随意访问的；
    // private 私有的，限制访问；
    
    
    //使用访问修饰符的位置：
    
    //5、类前面也可以加
    
    
    //1、类对象的属性；
    private String name;
    //2、类变量  变量前加了 static 
    private static String KIND;//
    
    
    //3、类对象的方法；
    private void method1(){
        
    }
    
    //4、类的方法 方法前加了 static 
    private static void method2(){
        
    }
    //3.1 构造方法
    private /*static 错误的*/ Public_PrivateDemo(){
        
    }

}
