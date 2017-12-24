/**
 * Project Name:lesson
 * File Name:Demo4.java
 * Package Name:lesson7
 * Date:2017年12月17日下午2:35:02
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;
/**
 * Description:   <br/>
 * Date:     2017年12月17日 下午2:35:02 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Demo4 {

    public static void main(String[] args) {

        int[] ary = new int[] { 12, 43, 6, 8, 34 };
        
        for(int i=0;i<ary.length;i++){
            System.out.print(ary[i]);
            System.out.print("》");
        }
        
        System.out.println();
        for(int i=0;i<ary.length;i++){
            int j = ary.length-i-1;
            System.out.print(ary[j]);
            System.out.print("》");
        }
        
        
        System.out.println();
        //int j;
        for(int i=ary.length-1;i>=0;i--){
            System.out.print(ary[i]);
            System.out.print("》");
        }
    }

}

