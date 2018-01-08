/**
 * Project Name:demoCode
 * File Name:SyncDemo.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日下午12:10:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午12:10:51 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class SyncDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            SyncThread st = new SyncThread("NO"+i);
            st.start();
        }
    }

}
