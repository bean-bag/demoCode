/**
 * Project Name:DT593
 * File Name:Test1.java
 * Package Name:lesson20171228
 * Date:2017年12月28日上午9:15:50
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lesson20171228;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月28日 上午9:15:50 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class Test1 {

    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入2个待计算的数据：");
            int val = scanner.nextInt();
            System.out.println("请输入第2个数据：");
            int val1 = scanner.nextInt();
            while (flag1) {
                System.out.println("请输入运算符号+-*/对2个数据进行计算");
                String str = scanner.next();

                switch (str) {
                case "+": {
                    System.out.println(val + "和" + val1 + "相加为" + (val + val1));
                    flag1 = false;
                }

                    break;
                case "-": {
                    System.out.println(val + "和" + val1 + "相减为" + (val - val1));
                    flag1 = false;
                }
                    break;
                case "*": {
                    System.out.println(val + "和" + val1 + "相乘为" + (val * val1));
                    flag1 = false;
                }
                    break;
                case "/": {
                    System.out.println(val + "和" + val1 + "相除为" + (val / val1));
                    flag1 = false;
                }
                    break;
                case "q": {
                    System.out.println("退出程序");
                    flag = false;
                    flag1 = false;
                    break;
                }
                default:

                    break;
                }
            }
        }

        // scanner.close();
    }
}
