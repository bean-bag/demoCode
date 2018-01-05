/**
 * Project Name:demoCode
 * File Name:MyClass.java
 * Package Name:
 * Date:2018年1月5日下午4:49:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月5日 下午4:49:43 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class MyClass {
    void myMethod(final int p) {
        final int il;
        final int i2 = p;
        il = 20;
        // i2 = 20;
    }

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
