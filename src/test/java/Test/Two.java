/**
 * Project Name:Demo
 * File Name:Two.java
 * Package Name:Test
 * Date:2017��12��28������10:12:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Test;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017��12��28�� ����10:12:46 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������:");
        int n = scanner.nextInt();

        for (int c = 0; c < n; c++) {
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < 6; i++) {
                    if ((j % 2 == 0) && (i % 2 == 0)) {
                        System.out.print("*" + " ");
                    } else if (i % 2 != 0 && j % 2 != 0) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("+" + " ");
                    }

                    // if (i % 2 != 0) {
                    // System.out.print("+");
                    // } else {
                    // System.out.print("*");
                    // }

                }

                System.out.println();
            }
        }
    }
}