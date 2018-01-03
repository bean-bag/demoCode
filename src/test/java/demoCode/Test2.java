/**
 * Project Name:data1
 * File Name:Test2.java
 * Package Name:data2
 * Date:2017年12月28日上午9:42:56
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package demoCode;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月28日 上午9:42:56 <br/>
 * 
 * @author tianyongxu
 * @version
 * @see
 */
public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String con;
        do {
            System.out.println("你可以得到矩形花阵");
            System.out.println("请输入需要的行数");
            int row = input.nextInt();
            System.out.println("请输入需要的列数");
            int list = input.nextInt();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < list; j++) {
                    if (i % 2 == 0) {
                        System.out.print("*");
                        System.out.print("+");
                    } else {
                        System.out.print("+");
                        System.out.print("*");
                    }
                }
                System.out.println();

            }
            System.out.println("是否继续y,其他任意键退出");
            con = input.next();
            if (con.equals("y")) {

            } else {
                break;
            }
        } while (con.equals("y"));
        System.out.println("运行结束，再见！");
        input.close();
    }

}
