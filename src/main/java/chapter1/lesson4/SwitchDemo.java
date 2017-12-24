/**
 * Project Name:lession1
 * File Name:SwitchDemo.java
 * Package Name:lession4
 * Date:2017年12月11日上午8:55:57
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson4;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月11日 上午8:55:57 <br/>
 * 
 * @author junwen.bao@airintelli.com
 * @version
 * @see
 */
public class SwitchDemo {

    /**
     * 当处在光谷转盘口，<br>
     * 前置条件<br>
     * 去某个地方， 要选择正确的路；<br>
     * 
     * Description: <br/>
     *
     * @author junwen.bao@airintelli.com
     * @param args
     */
    public static void main(String[] args) {
        // boolean condition = true;
        // if (condition) {
        //
        // } else if (1 == 2) {
        //
        // } else {// else 只能有一个
        //
        // }

        // （流程图）伪代码
        /**
         * if(选择虎泉路){<br>
         * //湖北商贸 <br>
         * }else if(选择鲁磨路){<br>
         * 地大
         * 
         * }else if(选择珞瑜东路){<br>
         * 华科
         * 
         * }else if(选择民族路){ <br>
         * 民族大学
         * 
         * }else if(选择珞瑜西路){<br>
         * 光谷校区 }
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择一条路：");

        boolean isOK = scanner.hasNextInt();

        if (isOK) {
            int key = scanner.nextInt();
            // 问题提示：sss

            // 1、 case的数据类型必须和key表达式相同
            // 2、 case的值 不能相同
            // 3、 case的一执行代码，最后要break;中断switch的判断；
            // 4、 default语句可以放在case语句前或者后，都可以，不影响业务逻辑；
            // 4.1 没有对应的常量值，就跳转到默认语句。
            // 5、 case 的语法要记住
            // 6、 case 与 比较的常量之间要有空格
            // int key = 0;

            // Ctrl + shift + / 注释选中的内容
            // int char byte short String(JDK 1.7这后的才可以用)

            // double long float boolean 不能作为比较类型

            // <b>体会处理 异常情况</b>

            // 根据心情，吃早餐

            switch (key) {
            case 1/* "虎泉路" */: {
                System.out.println("到湖北商贸");
            }
                break;
            case 2/* "鲁磨路" */:
                System.out.println("到地大");
                break;
            case 3/* "珞瑜东路" */:
                System.out.println("到华科");
                break;
            case 4/* "民族路" */:
                System.out.println("到民族大学");
                break;
            case 5/* "民族路" */:
                // System.out.println("到异次元空间");
                // break;
            case 6/* "民族路" */:
                // System.out.println("到异次元空间");
                // break;
            case 7/* "民族路" */:
                System.out.println("到异次元空间");
                break;
            default:
                System.out.println("光谷校区");
                break;
            }
        } else {
            System.out.println("请输入数值形的数据！");
        }
        scanner.close();
    }

}
