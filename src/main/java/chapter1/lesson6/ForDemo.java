/**
 * Project Name:lesson
 * File Name:ForDemo.java
 * Package Name:lesson6
 * Date:2017年12月14日下午3:22:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson6;
/**
 * Description:   <br/>
 * Date:     2017年12月14日 下午3:22:55 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ForDemo {

    public static void main(String[] args) {
        //int i0;//申明一个整型变量
        //int i1,i2=2,i3;//同时申明多个同类型变量；
        
        //int sum =0;//
        //int j=0;
        //char chr;
//        boolean result;
//        int m;
        for(//3
                int i=0,sum=1;//1
                i<=10 ; //2
                i++, sum++ //5
                ){
            sum = sum + i;
            
            if(sum > 15){
                break;
            }
            
            System.out.println(i);//4
        }
    }

}

