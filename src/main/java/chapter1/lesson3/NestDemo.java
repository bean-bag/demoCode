/**
 * Project Name:lession1
 * File Name:IFMp4.java
 * Package Name:lession3
 * Date:2017年12月9日下午3:14:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson3;

//import java.util.Scanner;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月9日 下午3:14:38 <br/>
 * @author   junwen.bao@airintelli.com
 * @version
 * @see
 */
public class NestDemo {

    /**
     * Description: <br/>
     *
     * @author junwen.bao@airintelli.com
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 加友情提示
        System.out.println("请输入百米的成绩：");

        int score = scanner.nextInt();
        
        boolean result = score < 10;

        if (result) {
            // 加友情提示
            System.out.println("请输入性别：");

            String strSex = scanner.next();

            char sex = strSex.charAt(0);

            boolean result2 = sex == '男';
            if (result2) {
                System.out.println("进男子组决赛。");
            } else {
                System.out.println("进女子组决赛。");
            }
        } else {
            System.out.println("参加啦啦队！");
        }

        scanner.close();
    }

}

