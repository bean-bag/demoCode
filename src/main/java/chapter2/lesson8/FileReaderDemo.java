/**
 * Project Name:demoCode
 * File Name:FileReaderDemo.java
 * Package Name:chapter2.lesson8
 * Date:2018年1月6日上午11:55:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 上午11:55:02 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class FileReaderDemo {
    private final static Logger LOG = Logger.getLogger(FileReaderDemo.class);

    public static void main(String[] args) throws IOException {
        // String path = "D:\\fileDirDemo\\Hellosorld.java";
        String path = "E:\\dt59\\homework\\github\\liutao\\src\\main\\java\\dt59homework\\Second.java";// 给path重新赋值；

        File file = new File(path);

        // 局部变量，需要 初始化
        FileInputStream fis = null;// 此处为什么放在try的外面？
        // 变量在哪个地方申明，就在哪个大括号下面，可以访问
        try {
            fis = new FileInputStream(file);

            byte[] b;// 申明一个字节数组变量b
            b = new byte[1024];// 创造一个空间为1024个字节的数组，并赋值给b;

            // 通过fis工具从file 中，读取byte数据到字节数组变量b中,
            // 读取字节个数的上限值：是b的长度
            // 实际读取的字节个数：len,即read()方法的返回值

            int len = fis.read(b);//

            while (len != -1) {//read()方法的返回值如果为-1，表示文件已读完。
                // b，字节数组；
                // offset:0,开始读的位置（下标）
                // length:10,从开始位置后数10个字节
                
                String str = new String(b, 0, len);//

                System.out.print(str);
                
                len = fis.read(b);
            }
            // } catch (Exception e) {
        } catch (FileNotFoundException e) {
            LOG.info("fnff", e);
        } catch (IOException e) {
            LOG.info("IO", e);
        } finally {
            if (fis != null) {//需要判断
                fis.close();
            }
        }

    }

}
