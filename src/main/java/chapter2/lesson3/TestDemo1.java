/**
 * Project Name:demoCode
 * File Name:TestDemo1.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日上午9:40:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 上午9:40:39 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestDemo1 {

    public static void main(String[] args) {
        
        //new Demo1();//实例化一个Demo1类对象
        //此处就是调用该类的无参构造
        
        //1、如果类中，没有定义构造方法，会生成一个默认的无参数构造方法；
        //2、如果类中，有定义其它构造方法，就不会生成默认的无参数构造方法；
        
        Demo1 demo1 = new Demo1("");
        
        //重载的基本机制
        //1：通过构造方法的名称
        //2：根据参数个数判断
        //3：根据参数类型
        //4：根据参数顺序（隐含的是参数类型的顺序 ）

    }

}

