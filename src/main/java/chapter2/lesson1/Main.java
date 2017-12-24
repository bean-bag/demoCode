/**
 * Project Name:lesson2
 * File Name:Main.java
 * Package Name:lesson2
 * Date:2017年12月24日上午10:47:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson1;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 上午10:47:04 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Main {

    public static void main(String[] args) {
        //基本类型的变量申明
        int i;
        
         i=1;
         
         //使用变量
         
         System.out.println("变量i="+i);
         
        //类类型的变量申明
        Cat cat;
        
        //类类型的变量怎么赋值
        // 1、new 产生一个新的类型对象，即，类型的具体实现
        // 2、类类型
        // 3、（）；
         cat = new Cat();//创建出一个对象：刚出生的一只猫
         //给猫取个名字==新产生的对象，name属性赋值 为“小花”
         // 对象名（cat）变量名 + “.” +属性名         
         //
         cat.name = "小花";
         cat.color="红色" ;
         cat.age= 1;

         System.out.println("猫的姓名："+cat.name);
         
         Cat cat2 = new Cat();//创建出一个对象：刚出生的一只猫
         //给猫取个名字==新产生的对象，name属性赋值 为“小花”
         // 对象名（cat）变量名 + “.” +属性名         
         //
         cat2.name = "小黄";
         cat2.color="黄色" ;
         cat2.age= 1;

         System.out.println("猫的姓名："+cat2.name);
         
         int count = cat.catchMouse();
         
         System.out.println("捕到的老鼠数据 ："+count);
         
         cat.eat();
    }

}

