/**
 * Project Name:demoCode
 * File Name:CloseHelper.java
 * Package Name:chapter2.demo
 * Date:2018年1月11日下午3:31:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.demo;

import java.io.Closeable;
import java.io.IOException;

/**
 * Description: <br/>
 * Date: 2018年1月11日 下午3:31:36 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class CloseHelper {

    /**
     * 禁止使用构造方法 Creates a new instance of CloseHelper.
     *
     */
    private CloseHelper() {
    }

    /**
     * 顺序关闭一个或者多个Closeable对象
     * <br/>
     *
     * @author junwen.bao
     * @param close
     * @throws IOException 
     */
    public static void close(Closeable ...close) throws IOException {
        for (int i = 0; i < close.length; i++) {
            if (close[i] != null) {
                close[i].close();
            }
        }
    }
    
    /**
     * 安静地 顺序关闭一个或者多个Closeable对象
     * <br/>
     *
     * @author junwen.bao
     * @param close
     */
    public static void quietClose(Closeable ...close) {
        for (int i = 0; i < close.length; i++) {
            if (close[i] != null) {
                try {
                    close[i].close();
                } catch (IOException e) {
                }
            }
        }
    }
}
