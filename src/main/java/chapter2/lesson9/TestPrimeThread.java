/**
 * Project Name:demoCode
 * File Name:TestPrimeThread.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午10:31:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午10:31:56 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TestPrimeThread {

    public static void main(String[] args) {

        /*
         * PrimeThread p = new PrimeThread(143); //p.run();
         * p.start();//一个thread实例，只能调用一次 //p.start();
         * 
         * PrimeThread p1 = new PrimeThread(144); p1.start();
         * 
         * PrimeThread p2 = new PrimeThread(145); p2.start();
         */
        for (int i = 0; i < 100; i++) {
            PrimeThread p3 = new PrimeThread(i);
            p3.start();
            if (i % 8 == 0) {
                p3.setVip("vip");
                p3.setPriority(Thread.MAX_PRIORITY);//做先级最大值：10；
            }
                //Thread.NORM_PRIORITY//正常值是：5
            if(i==1){
                p3.setPriority(Thread.MIN_PRIORITY);//做先级最小值：1；
                p3.setVip("比较衰");
            }
        }

    }

}
