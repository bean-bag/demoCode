/**
 * Project Name:lesson
 * File Name:Swap.java
 * Package Name:lesson7
 * Date:2017年12月17日下午12:11:30
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;
/**
 * Description:   <br/>
 * Date:     2017年12月17日 下午12:11:30 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Swap {

    public static void main(String[] args) {

       //int[] ary = new int[]{5,7};
        //把A和B的值交换一下；
       int a = 1;
       int b = 2;
       System.out.println("a:"+a+"\tb:"+b);
       
       
       int tmp = a;//把要交换的值a，存入第三个变量中；
       
       a = b; //
       
       b = tmp; //把存入第三个变量中的值（即原来a中的值），赋值给b;
       
       //b = a = b;
       System.out.println("a:"+a+"\tb:"+b);
       
       
    }

}

