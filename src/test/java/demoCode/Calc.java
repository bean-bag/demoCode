/**
 * Project Name:data1
 * File Name:Calc.java
 * Package Name:data2
 * Date:2017年12月28日上午9:17:32
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package demoCode;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月28日 上午9:17:32 <br/>
 * 
 * @author tianyongxu
 * @version
 * @see
 */
public class Calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exit;
        do {
            System.out.println("欢迎使用Casio计算机");
            System.out.println("请输入您的第一个数");
            double firstNum = input.nextDouble();
            System.out.println("请输入" + "+," + "-," + "*" + "/" + "四个符中的一个");
            String key = input.next();
            double secondNum;
            do {
                System.out.println("请输入您的第二个数");
                secondNum = input.nextDouble();
                if (key.equals("/")) {
                    if (secondNum == 0) {
                        System.out.println("除数不能为零");
                    }
                }
            } while (secondNum == 0);
            
            switch (key) {
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("请输入正确的符号");
                break;
            }
            System.out.println("输入q退出程序,其他任意键为继续");
            exit = input.next();

        } while (!(exit.equals("q")));
        System.out.println("欢迎下次使用Casio计算机");
        input.close();
    }
}
