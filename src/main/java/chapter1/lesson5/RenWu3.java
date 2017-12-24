package chapter1.lesson5;
/**
 * Project Name:lession
 * File Name:RenWu3.java
 * Package Name:day03
 * Date:2017年12月13日下午2:27:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月13日 下午2:27:16 <br/>
 * @author   11324
 * @version
 * @see
 */
public class RenWu3 {

    public static void main(String[] args) {
        //学盟
        Scanner input=new Scanner(System.in);
        boolean cont;// = true;
        //变量的作用域
        do{
            cont = true;
        //  Auto-generated method stub
        System.out.println("猜拳游戏");
        System.out.println("‘1’代表：石头");
        System.out.println("‘2’代表：剪刀");
        System.out.println("‘3’代表：布");
        System.out.println("‘0’代表：退出游戏");

        System.out.println("请输入对应的数字：");
        int a = input.nextInt();
        
        Random ran = new Random();
        int rlnt = ran.nextInt();
        int x = Math.abs(rlnt%3)+1;
        
        switch(a){
        case 1:
            if(x==1){
                System.out.println("电脑出的是石头与您打成平局"); 
            }else if(x==2){
                System.out.println("电脑出的是剪刀，您获得胜利"); 
            }else{
                System.out.println("电脑出的是布，您输了"); 
            }
            break;
            
        case 2:
            if(x==1){
                System.out.println("电脑出的是石头，您输了"); 
            }else if(x==2){
                System.out.println("电脑出的是剪刀与您打成平局"); 
            }else{
                System.out.println("电脑出的是布，您获得胜利"); 
            }
            break;
            
        case 3:
            if(x==1){
                System.out.println("电脑出的是石头，您获得胜利"); 
            }else if(x==2){
                System.out.println("电脑出的是剪刀，您输了"); 
            }else{
                System.out.println("电脑出的是布与您打成平局"); 
            } 
            break;
            
        case 0: 
            //System.out.println("感谢您的使用"); 
            cont = false;
            break;
        default:
            System.out.println("无法识别");    
        }
        }
        
        while(cont);
        
        input.close();
    }

}

