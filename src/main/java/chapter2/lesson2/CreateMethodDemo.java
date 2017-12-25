/**
 * Project Name:demoCode
 * File Name:CreateMethodDemo.java
 * Package Name:chapter2.lesson2
 * Date:2017年12月25日上午9:14:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson2;
/**
 * Description:   <br/>
 * Date:     2017年12月25日 上午9:14:47 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class CreateMethodDemo {

    /**
     * 运行入口方法
     * Description: <br/>
     *
     * @author junwen.bao
     * @param args
     */
    public static void main(String[] args) {
        
        //1、定义方法所在类的类变量；
        CreateMethodDemo createMethodDemo;
        //2、创建这个类的对象 实例；
        createMethodDemo = new CreateMethodDemo();
        //3、通过类名，调用该方法(间接调用方法)
        createMethodDemo.say();
        
        String result = createMethodDemo.returnDemo();
        System.out.println(result);
        
        //该方法与当前类，没有直接关联关系
        //borrowBook();
    }
    /**
     * 无参的方法：说话
     * Description: <br/>
     *
     * @author junwen.bao
     */
    /*定义返回数据的类型*/ /*方法名*/ /*（）*/ /*{代码块|方法体 }*/
    void say(){
        System.out.println("Hello World.");
        /*直接调用本类的方法：直接写方法名（）*/
        
        //类在jvm中执行；加载类（会把类的方法，及属性全部列出来）；类方法的执行；
      
        System.out.println("我给借的的书" + borrowBook());
        //return;
    }
    
    String borrowBook(){
        /*1、return */
        /*2、返回值的数据类型要 方法申明时定义的返回数据类型一致*/
        //System.out.println("over!");
        over();
        return "《java 编程思想》---《Thinking in Java》";
    }
    /**
     * 演示，return 能退出方法体
     * Description: <br/>
     *
     * @author junwen.bao
     * @return
     */
    String returnDemo(){
        int i=1;
        if(i==0){//在某种情况下
            return "异常情况下返回";//类似switch语句的break;
        }
        
        System.out.println("正常的执行内容");
        //System.out.println("over!");
        over();
        return "正常返回";
    }
    /**
     * 演示：return 后面可是表达式
     * Description: <br/>
     *
     * @author junwen.bao
     * @return
     */
    int calc(){
        int a = 1;
        int b = 1;
        
        //System.out.println("yes Sir!over!");
        over();
        return a+b;
    }
    
    void over(){
        System.out.println("yes Sir!over!");
    }
    
}

