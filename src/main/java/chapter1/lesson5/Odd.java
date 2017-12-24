/**
 * Project Name:lesson
 * File Name:Odd.java
 * Package Name:lesson5
 * Date:2017年12月14日下午2:45:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson5;
/**
 * Description:   <br/>
 * Date:     2017年12月14日 下午2:45:39 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Odd {

    public static void main(String[] args) {
        int i =0;
        int j = 2;
       while(i<100){
           j = j * (-1);
           
           System.out.println(j);
           i++;
       }
    }

}

