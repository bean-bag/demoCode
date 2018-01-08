/**
 * Project Name:demoCode
 * File Name:cc.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午10:55:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 上午10:55:16 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class PrimeRun implements Runnable {
    long minPrime;
    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        // compute primes larger than minPrime
         System.out.println(minPrime);
    }
}


