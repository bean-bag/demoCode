/**
 * Project Name:demoCode
 * File Name:TestPrimeRun.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午10:56:11
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 上午10:56:11 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestPrimeRun {

    public static void main(String[] args) {

        PrimeRun p = new PrimeRun(143);
        
        new Thread(p).start();
        new Thread(new PrimeRun(145)).start();
        new Thread(new PrimeRun(146)).start();
        new Thread(new PrimeRun(147)).start();


    }

}

