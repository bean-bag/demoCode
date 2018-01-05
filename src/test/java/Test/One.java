/**
 * Project Name:Demo
 * File Name:One.java
 * Package Name:Test
 * Date:2017年12月28日上午9:46:54
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Test;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月28日 上午9:46:54 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class One {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("请输入你想要的算法,例如+,—,*,/");

        String c = scanner.next();
        if (c.equals("+")) {

            System.out.println(a + b);
        }
            if (c == "-") {
                System.out.println(a - b);
            }
            if (c == "*") {
                System.out.println(a * b);
            }
            if (c == "/") {
                System.out.println(a / b);
            }
        
        scanner.close();
    }

}
