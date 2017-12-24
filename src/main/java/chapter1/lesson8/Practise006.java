/**
 * Project Name:study
 * File Name:Practise006.java
 * Package Name:lession7
 * Date:2017年12月18日下午1:03:52
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson8;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月18日 下午1:03:52 <br/>
 * 
 * @author lenovo
 * @version
 * @see
 */
public class Practise006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入层数:");
        int n = scanner.nextInt();
        int[][] arry = new int[2 * n - 1][2 * n - 1];
        for (int i = 0; i < arry.length; i++) {
            // arry[i] = arry[i + 1];
            for (int j = 0; j < arry[i].length; j++) {

                // arry[i][0] = arry[0][j] = arry[i][lon - 1] = arry[lon -
                // 1][j]=1;
                //找出两个参数中，较大 的一个；
                //Math.max(a, b)
                
                int a = n - Math.max(Math.abs(n - i-1), Math.abs(n  - j-1));

                // 暂时无法找到i,j,n之间的规律的关系式，求讲解，在网上找的关系式
                System.out.print(a+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
