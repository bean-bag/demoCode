/**
 * Project Name:DT593
 * File Name:Test2.java
 * Package Name:lesson20171228
 * Date:2017年12月28日上午9:36:02
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lesson20171228;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月28日 上午9:36:02 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入矩形的高度：");
        int a = scanner.nextInt();
        System.out.print("请输入矩形的宽度：");
        int b = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }

                } else {
                    if (j % 2 != 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }

                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
