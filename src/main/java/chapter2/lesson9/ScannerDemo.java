/**
 * Project Name:demoCode
 * File Name:ScannerDemo.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午9:34:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 上午9:34:20 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class ScannerDemo {
    private final static Logger LOG = Logger.getLogger(ScannerDemo.class);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LOG.info("请输入：");
        String text = scan.next();

        LOG.info("你输入了：" + text);

        scan.close();
    }

}
