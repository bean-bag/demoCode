/**
 * Project Name:demoCode
 * File Name:ScannerThread.java
 * Package Name:chapter2.lesson9
 * Date:2018年1月8日上午9:40:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson9;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 上午9:40:02 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ScannerThread extends Thread {
    private int num;
    private final static Logger LOG = Logger.getLogger(ScannerThread.class);
    
    
    public ScannerThread(int num) {
        this.num = num;
    }


    @Override
    public void run() {
        if(num == 1){
            
            Scanner scan = new Scanner(System.in);
            LOG.info("请输入：");
            String text = scan.next();

            LOG.info("你输入了：" + text);

            scan.close();
            
        }
        LOG.info("第"+num +"个ScannerThread实例，正在运行");
    }

}

