/**
 * Project Name:lesson
 * File Name:Demo4.java
 * Package Name:lesson7
 * Date:2017年12月17日下午2:35:02
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;

/**
 * Description: <br/>
 * Date: 2017年12月17日 下午2:35:02 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Demo5 {

    public static void main(String[] args) {

        int[] ary = new int[] { 12, 43, 6, 8, 34 };
        int[] ary2 = new int[ary.length];// 硬编码
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i]);
            System.out.print("》");
        }
        
        System.out.println();
        for (int i = ary.length - 1; i > -1; i--) {
            System.out.println(ary[i]);
        }

        for (int j = 0; j < ary.length; j++) {
            ary2[j] = j;
        }

        System.out.println();

        for (int i = ary.length - 1, j = 0; i > -1; i--, j++) {
            ary2[j] = ary[i];
        }
        
        System.out.println("倒置后的结果");
        for (int i = 0; i < ary2.length; i++) {
            System.out.print(ary2[i]);
            System.out.print("》");
        }
    }

}
