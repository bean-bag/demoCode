/**
 * Project Name:demoCode
 * File Name:TestScanner.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午10:49:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月3日 上午10:49:41 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TestException {

    //把当前方法中的异常，抛出给调用者（调用此方法的方法）
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串数据：");
       
        try {
            String str = scanner.next();
           int len = str.length();
           if(len <3){
               //抛出 新的异常
             throw new Exception("输入的字符长度不够");
               
               //System.out.println("输入的字符长度不够");
           }         
            
        } catch (NullPointerException e1) {
            throw e1;
        } catch (RuntimeException e1) {
            throw e1;
        } catch (Exception e1) {
            // 捕捉 什么 类型的异常

            System.out.println("请输正确的数据");
            
            e1.printStackTrace();
            throw e1;
            //return ;
        }finally{
            //最后的
            
            scanner.close();
        }

        //System.out.println(val);


    }

}
