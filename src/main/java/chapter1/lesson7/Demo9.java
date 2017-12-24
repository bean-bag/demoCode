/**
 * Project Name:lesson
 * File Name:Demo9.java
 * Package Name:lesson7
 * Date:2017年12月17日下午4:38:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;

/**
 * Description: <br/>
 * Date: 2017年12月17日 下午4:38:19 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Demo9 {

    public static void main(String[] args) {

//        int[] ary = new int[5];
//
//        int[][] ary2 = new int[9][1];
//
//        int[] tmp = ary2[0];
//
//        ary2[0][0] = 0;
//
//        ary2 = new int[][] { { 1, 2, 3 }, { 3, 4, 5 } };
//        
//        System.out.println(ary2[1][0]);
        
        
        int[] ary3 = new int[5];
        
        System.out.println(ary3[4]);
        
        String[] ary4 = new String[5];
        
        System.out.println(ary4[4]);
        
        boolean[] ary5 = new boolean[5];
        
        System.out.println(ary5[4]);
        
        char[] ary6 = new char[5];
        System.out.println(ary6[4] == ' ');
        System.out.println("|"+ary6[4]+"|");
        System.out.println("==============");
        System.out.println((int)ary6[4] );
        
        System.out.println((int)' ' );
    }

}
