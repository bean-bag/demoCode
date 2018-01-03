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
public class TestScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个短整型数据：");
        //
        // if(scanner.hasNextInt()){
        // int val = scanner.nextInt();
        // System.out.println(val);
        // }
        //
        // if(scanner.hasNextBoolean()){
        // boolean val = scanner.nextBoolean();
        // System.out.println(val);
        // }

        try {
            String str = null;
            str.length();
            // 尝试在，下面的范围内
            short val = scanner.nextShort();
            System.out.println(val);
        } catch (Exception e1) {
            // 捕捉 什么 类型的异常

            System.out.println("请输正确的数据");
            
            e1.printStackTrace();
        }

        //System.out.println(val);

        scanner.close();

    }

}
