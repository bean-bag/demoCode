/**
 * Project Name:lesson
 * File Name:Demo1.java
 * Package Name:lesson9
 * Date:2017年12月20日下午2:33:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson9;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月20日 下午2:33:32 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Demo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请选择要操作菜单项：");
        
        if (scanner.hasNextInt()) {

            int code = scanner.nextInt();
            if(0<code && code<7){
                System.out.println(code);
            }else{
                System.out.println("请输入1~6之间的数字！");
            }
        }else{
            System.out.println("请输入数字！");
        }
        scanner.close();

    }

}
