/**
 * Project Name:demoCode
 * File Name:Demo2.java
 * Package Name:
 * Date:2018年1月5日下午4:02:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月5日 下午4:02:27 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class Demo2 {
    private static String s;

    public static void main(String[] args) {
        // String s;

        char a = '8';
        int b = a;
        System.out.println(b);
        System.out.println(8 == '8');

        System.out.println("s=" + Demo2.s);
        
        
        for(int i=0;i<256;i++){
            System.out.print("\t"+i + ":" + (char)i);
            if((i+1)%10==0){
                System.out.println();
            }
        }

    }
}
