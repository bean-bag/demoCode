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
public class IFMp4 {

    /**
     * Description: <br/>
     *
     * @author junwen.bao@airintelli.com
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 加友情提示
        System.out.println("请输入张浩的成绩：");

        int score = scanner.nextInt();

        boolean result = score > 90;

        if (result) {
            System.out.println("奖励一个MP4。");
        } else {
            System.out.println("抄写java代码100遍！");
        }

        scanner.close();
    }

}

