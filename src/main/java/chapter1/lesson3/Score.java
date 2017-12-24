/**
 * Project Name:lession1
 * File Name:Score.java
 * Package Name:lession
 * Date:2017年12月9日下午4:15:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson3;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月9日 下午4:15:35 <br/>
 * 
 * @author junwen.bao@airintelli.com
 * @version
 * @see
 */
public class Score {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 加友情提示
        System.out.println("请输入张浩的成绩：");

        int score = scanner.nextInt();

        boolean result = score > 80;

        boolean result2_0 = score < 80;
        boolean result2_1 = score > 60;

        boolean result2 = result2_0 && result2_1;

        boolean result3 = score > 30;

        // 有6条路
        // 1 鲁磨路
        // 2 民族大道
        // 3 珞瑜东路；
        // 4 虎泉路；
        // 5 珞瑜四路；

        if (result) {
            System.out.println("优");
        }

        if (result2) {
            // 小于80分的
            System.out.println("良");
        } else if (result3) {
            // 小于60分的
            System.out.println("较差");
        } else {
            //
            System.out.println("差");
        }
        scanner.close();
    }

}
