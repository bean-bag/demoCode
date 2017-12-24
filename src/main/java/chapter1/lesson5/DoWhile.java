/**
 * Project Name:lesson
 * File Name:Circle.java
 * Package Name:lesson5
 * Date:2017年12月13日上午10:43:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson5;

import java.util.Random;

/**
 * Description:   <br/>
 * Date:     2017年12月13日 上午10:43:26 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class DoWhile {

    public static void main(String[] args) {
//        int i=0;
//        do{
//            System.out.print("*");
//            i++;
//        }while(i<=100);
        
        
//        int num = 153;
        
//        double num1 = num /100d;
//        int num2 = (num - num1*100)/10;
//             num2 = num%100/10;
//        int num3 = num%10;
        
        //System.out.println(num1);
        
        Random ran = new Random();//产生随机数
        
        int rInt = ran.nextInt();//只产生随机数整数（包含负数）
        //Math.abs();取绝对值
        System.out.println(Math.abs(rInt%3)+1);

    }

}

