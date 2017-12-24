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
public class Demo6 {

    public static void main(String[] args) {

        int[] ary = new int[] { -12, 43, 6, 8, 34 };
        
        int max = ary[0];
        int min = ary[0];
        
        for (int i = 0; i < ary.length; i++) {
            int val = ary[i];
            if(max < val){
                max = val;
            }
            if(min > val){
                min = val;
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
    }

}
