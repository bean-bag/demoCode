/**
 * Project Name:demoCode
 * File Name:DD.java
 * Package Name:
 * Date:2018年1月5日下午5:15:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description:   <br/>
 * Date:     2018年1月5日 下午5:15:53 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class DD {

    public static void main(String[] args) {
        int sum = 1;
//        int sua = 1;
            int num = 1;
        for (int i = 0; i < 9; i++) {

            num = (num + 1) * 2;
//            sum = num + num + i;
            
            sum = (sum +1) * 2;
        }
        System.out.println(sum);
    }

}

/**
a0 = 1
a1 = (a0 +1)*2
a2 = (a1 +1)*2
a3 = (a2 +1)*2


*/