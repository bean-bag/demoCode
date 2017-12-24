/**
 * Project Name:lesson
 * File Name:Shop.java
 * Package Name:lesson5
 * Date:2017年12月13日下午12:04:56
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson5;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月13日 下午12:04:56 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class Shop {

    public static void main(String[] args) {

       /**
        * 一层菜单：
        * 可重复使用；
        * 按什么退出；
        * 
        * 一、
        * ********************
        * 
        * 欢迎登录XXX系统 
        * 
        * 
        * 1、登录页面
        * 2、退出；
        * *******************
        * 
        * 二、
        *         
        *   欢迎下次光临！
        * 
        */
        boolean cont;
        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("*********************\n"+
        "*\n"+
        "* 欢迎登录XXX系统\n"+
        "* \n"+
        "* \n"+
        "* 1、登录页面\n"+
        "* 2、退出；\n"+
        "********************");
        int step = scan.nextInt();
        
        if(step == 1){
            //二级菜单
            
        }
        cont = step !=2;
        
        }while(cont);
        
        System.out.println("欢迎下次光临！");
        scan.close();
    }

}

