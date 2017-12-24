/**
 * Project Name:lesson
 * File Name:Lesson6.java
 * Package Name:lesson6
 * Date:2017年12月14日下午5:40:42
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson6;

/**
 * Description: <br/>
 * Date: 2017年12月14日 下午5:40:42 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Lesson6 {

    public static void main(String[] args) {

        int count = 5;
        for (int i = 0; i < count; i++) {
            int r = count - i - 1;//重点
            for (int j = 0; j < count; j++) {
                if (j < r) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();//此处需要理解；
        }
        right_top();
    }

    public static void right_top(){
        int count = 6;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();//此处需要理解；
        }  
    }
    
    // System.out.print(" ");
    // System.out.println("i="+i+"\tj="+j);
}
