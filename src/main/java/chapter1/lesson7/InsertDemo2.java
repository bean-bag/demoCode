/**
 * Project Name:lesson
 * File Name:InsertDemo.java
 * Package Name:lesson7
 * Date:2017年12月17日上午11:57:48
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;

/**
 * Description: <br/>
 * Date: 2017年12月17日 上午11:57:48 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class InsertDemo2 {

    public static void main(String[] args) {

        int[] ary = new int[] { 12, 43, 6, 8, 34 };
        for (int i = 0; i < ary.length; i++) {
            System.out.print(" >> " + ary[i]);
        }
        System.out.println();
        
        // 在第三个位置插入一个数值： 5；
        int global = ary[2];//直接处理，不在循环中操作
        ary[2] = 5;

        for (int i = 3; i < ary.length; i++) {
            int tmp = ary[i];
            ary[i] = global;// 使用上一次存入的值；
            global = tmp;// 把旧值存入全局变量，在下次循环中使用此变量
        }

        for (int i = 0; i < ary.length; i++) {
            System.out.print(" >> " + ary[i]);
        }
    }

}
