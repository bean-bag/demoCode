/**
 * Project Name:lesson
 * File Name:ArrayDemo.java
 * Package Name:lesson7
 * Date:2017年12月17日上午9:20:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;
/**
 * Description:   <br/>
 * Date:     2017年12月17日 上午9:20:22 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int var;//申明一个整型变量，名称为var;
        int[] ary;//申明一个整型数组，名称为ary;
        
        var = 1;//赋值；
        //ary = 1;
        
        //怎么初始化数组；
        //   怎么定义数组的长度；
        
            ary =  new int [5];//基本的初始化？
            
            ary = new int[]{13,42,23};//初始化
            
        //怎么使用下标/索引？
        
        ary[0] = 10;//（操作数组）赋值；
        ary[1] = 8;
        
        System.out.println(var);
        System.out.println(ary[0]);//使用数组
        System.out.println(ary[1]);
        
        //下标的第一个值是0；
        
        //
        //System.out.println(ary[5]);
        //下标的最小值：是0；最大值：数组的长度-1；
        int [] ary2 = new int [1];
        
        ary2[0] = 10;
        
        System.out.println("数组ary2的长度:" + ary2.length);
        System.out.println(ary2[0]);
        
        //int[] ary3 = {12,34,646};
    }

}

