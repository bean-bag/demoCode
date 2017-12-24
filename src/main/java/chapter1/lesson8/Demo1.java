/**
 * Project Name:lesson
 * File Name:Demo1.java
 * Package Name:lesson8
 * Date:2017年12月19日上午8:47:30
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson8;
/**
 * Description:  在控制台，以*号的形式输入一个M*N矩形 <br/>
 * Date:     2017年12月19日 上午8:47:30 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Demo1 {

    public static void main(String[] args) {
        //三部分：初始化；条件比较；自增长变量叠代；
       //int i;//申明一个整形的变量，变量名为i;
        int m = 7;
        int n = 9;
        //
       for(int i = 0;i<m;i++){//1、作用域；2、循环体
           int j = 0;
           while(j<n){
               //goto;
               j++;
               if(i==3){
                   //int abc = 1;
                   continue;
                   //break;直接退出循环
               }
               //1、本次循环
               //2、当前关键字后的“所有”代码都不执行；
               System.out.print(j);
               
               //int x = j+1;
           }
           System.out.print("\n");
       }

    }

}

