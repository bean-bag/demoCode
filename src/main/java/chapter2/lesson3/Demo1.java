/**
 * Project Name:demoCode
 * File Name:Demo1.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日上午9:39:58
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;

/**
 * Description: <br/>
 * Date: 2017年12月27日 上午9:39:58 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Demo1 {
    
    String name;
    
    

    //没有定义无参构造，但是定义的其它构造方法
    

    public Demo1(String name) {
        //new Demo1();
        //this();
    }
    
    /**
     * 构造方法和普通方法的区别<br>
     * 
     * 构造方法的作用:创建一个类对象，“一个类”就是指该构造方法，所在的类；可以在构造方法中，做数据初始化
     * 普通方法的作用：把操作包装（封装）起来，隐藏业务代码
     * 
     * 构造方法，不能有返回值；
     * 普通方法，必须有返回值；
     * 
     * 构造方法必须名字与类名相同
     * 普通方法，不建议与类名相同；
     */
    
    public Demo1(){
        
    }

}
