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
public class InsertDemo3 {

    public static void main(String[] args) {

        int[] ary = new int[] { 12, 43, 6, 8, 34 };
        for (int i = 0; i < ary.length; i++) {
            System.out.print(" >> " + ary[i]);
        }
        System.out.println();
        
        int[] ary2 = new int[ary.length];
        for(int i=0;i<2;i++){//直接复制
            ary2[i] = ary[i];
        }
        
        ary2[2]=5;//插入新值到此位置；
        for(int i=3;i<ary.length;i++){
            ary2[i]= ary[i-1];//把靠前的位置，往后移了一位
        }

        for (int i = 0; i < ary2.length; i++) {
            System.out.print(" >> " + ary2[i]);
        }
    }

}
