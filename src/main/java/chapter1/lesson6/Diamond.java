/**
 * Project Name:lesson
 * File Name:Diamond.java
 * Package Name:lesson6
 * Date:2017年12月15日下午3:30:45
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson6;

/**
 * Description: <br/>
 * Date: 2017年12月15日 下午3:30:45 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Diamond {

    public static void main(String[] args) {
        int count = 15;
        int half = (count - 1) / 2;   //    
        for (int i = 0; i < count; i++) {
            
            //int m = (i <= half) ? i : half*2 - i;
            int m;
            if(i <= half){
                m = i;
            }else{
                m = half*2 - i;
            }
            
            for (int j = 0; j <count; j++) {
                int min = half - m;
                int max = half + m;
                if (min > j || j > max) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
