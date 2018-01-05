import java.util.Scanner;

/**
 * Project Name:demoCode
 * File Name:ww.java
 * Package Name:
 * Date:2018年1月5日下午5:33:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月5日 下午5:33:42 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TestSong2 {

    public static void main1(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入矩形的宽：");
        int a = str.nextInt();
        System.out.println("请输入矩形的高：");
        int b = str.nextInt();
        int i;
        int j;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                //if (i % 2 == 0) {
                    if ((i+j) % 2 == 0) {
                        System.out.print("+");
                    } else {
                        System.out.print("*");
                    }
               /* } else {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("+");
                    }
                }*/
            }
            System.out.println();

        }

    }
    
    public static void main(String[] args) {
        //"".equals(anObject)
        int taozi = 1;
        int out = 0;
        for (int i = 0; i < 9; i++) {
            out = (taozi + 1) * 2;
            taozi = out;
        }
        System.out.println(out);
    }
}
