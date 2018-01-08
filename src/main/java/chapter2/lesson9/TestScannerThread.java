/**
 * Project Name:demoCode
 * File Name:TestScannerThread.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午9:43:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午9:43:35 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TestScannerThread {

    public static void main(String[] args) {
        
        /**
         * 去银行取钱：
         * 1、取票(排号)
         * 2、到柜台---随机的（工作人员的心情，决定哪个号先办理）
         * 3、办理业务
         */
        for (int i = 0; i < 10; i++) {
            ScannerThread st = new ScannerThread(i);
            
            
            st.start();//1、把thread运行的控制权，交给cpu
            
            //st.run();//3、再由cpu，决定什么时候执行run()方法
        }
        
        //谁控制这个Thread什么时候执行？
        //CPU,随机执行任意thread
        
        
        //这种方式：充分利用系统资源，不会因为某个thread中断，而停止执行；
    }

}
