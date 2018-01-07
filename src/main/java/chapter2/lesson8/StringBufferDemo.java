/**
 * Project Name:demoCode
 * File Name:StringBufferDemo.java
 * Package Name:chapter2.lesson8
 * Date:2018年1月6日上午9:53:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson8;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 上午9:53:38 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class StringBufferDemo {
    private final static Logger LOG = Logger.getLogger(StringBufferDemo.class);

    public static void main(String[] args) {

        // buffer 缓冲

        String str = "string";

        String str2 = "buffer";

        // char chr = 'A';//65
        // String str4 = "A";
        // 基本数据类型，比包装数据类型（类对象），开销更少；

        String str3 = (str + str2) + str2;//最少做了两次toString()操作
        LOG.info("str + str2+str2:" + str3);

        char[] chars = str.toCharArray();

        StringBuffer sb = new StringBuffer();

        sb.append(str);//以基本数据类型为基础操作
        sb.append(str2);//新追加的数据，是动态的，更应用StringBuffer;
        sb.append(str2);

        String result = sb.toString();//转成字符串，只做一次
        LOG.info("buffer:" + result);

        StringBuilder sb2 = new StringBuilder();
        
        
    }
}
