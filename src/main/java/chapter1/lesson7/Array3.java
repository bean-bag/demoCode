package chapter1.lesson7;


import java.util.Scanner;

/**
 * Project Name:lession1
 * File Name:Array3.java
 * Package Name:
 * Date:2017年12月18日下午3:58:23
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2017年12月18日 下午3:58:23 <br/>
 * 
 * @author 57745
 * @version
 * @see 4）编写程序，输出n层正方形图案。正方形图案最外层是第一层，每层用的数字和层数相同
 */
public class Array3 {

    public static void main(String[] args) {
        // 创建一个Scanner对象，并导包
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        // 定义一个int类型变量num
        int num = sc.nextInt();
        // 定义数组【num * 2 - 1】限制数组元素的长度
        int[] arr = new int[num * 2 - 1];
        // 用双重for循环来遍历数组中的数据，并且利用双重for循环打印出相应的图形
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length; j++) {
                /*
                 * 2 * num- (arr.length - Math.max(Math.abs(i -
                 * num),Math.abs(j-num))) <br> 求出了图形中每个位置中打印的数字<br>
                 * 代码中Math.abs(i-num)是求图形的列中的最大数 Math.abs(j - num)是求行中的最大的数
                 */
                System.out.print(num - Math.max(Math.abs(i - num), Math.abs(j - num)) + " ");
            }
            System.out.println();// 换行
        }
        sc.close();
    }
}
