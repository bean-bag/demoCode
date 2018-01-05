/**
 * Project Name:Demo
 * File Name:Three.java
 * Package Name:Test
 * Date:2017��12��28������11:09:27
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Test;

/**
 * Description: <br/>
 * Date: 2017��12��28�� ����11:09:27 <br/>
 * 
 * @author l
 * @version
 * @see
 */
public class Three {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 9; i++) {

            int num = 1;
            num = (sum + 1) * 2;
            sum = num + (num + i);
        }
        System.out.println(sum);
    }

}
