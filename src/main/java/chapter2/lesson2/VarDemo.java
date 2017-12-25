/**
 * Project Name:demoCode
 * File Name:VarDemo.java
 * Package Name:chapter2.lesson2
 * Date:2017年12月25日上午10:48:17
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson2;
/**
 * Description:   <br/>
 * Date:     2017年12月25日 上午10:48:17 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class VarDemo {
    
    int varClass;
    String str="成员变量值";// 成员变量

    public static void main(String[] args) {
        VarDemo vd = new VarDemo();
        vd.varInit2();

    }

    void varInit1(){
        int i;//局部变量
        //int i;
        System.out.println(varClass);//此处可以使用未手工初始化的类变量
        //System.out.println(i);//此处理，局部变量未手工指定，则编译报错
        
        
        
    }
    
    void varInit2(){
        int i;
        String str="局部变量的值";//不同作用域的变量可以相同
        //局部变量的优先级 高于 成员变量；
        System.out.println(str);
    }
}

