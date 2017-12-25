/**
 * Project Name:demoCode
 * File Name:CreateMethodDemoCaller.java
 * Package Name:chapter2.lesson2
 * Date:2017年12月25日上午10:07:49
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson2;
/**
 * Description:   <br/>
 * Date:     2017年12月25日 上午10:07:49 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class CreateMethodDemoCaller {

    public static void main(String[] args) {

       /**
        * 演示调用其它类的方法
        */
      //1、定义方法所在类的类变量；
        CreateMethodDemo createMethodDemo;
        //2、创建这个类的对象 实例；
        createMethodDemo = new CreateMethodDemo();
        //3、通过类名，调用该方法(间接调用方法)
        createMethodDemo.say();
        
        String result = createMethodDemo.returnDemo();
        System.out.println(result);
    }

}

