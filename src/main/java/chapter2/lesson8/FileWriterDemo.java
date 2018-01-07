/**
 * Project Name:demoCode
 * File Name:FileWriterDemo.java
 * Package Name:chapter2.lesson8
 * Date:2018年1月6日下午5:21:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午5:21:55 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class FileWriterDemo {
    private final static Logger LOG = Logger.getLogger(FileWriterDemo.class);

    public static void main(String[] args) throws IOException {
        String path = "D:\\fileDirDemo\\testWriter.java";
        File file = new File(path);
        writer(file);
    }

    public static void writer(File file) throws IOException {
        // 局部变量，需要 初始化
        FileOutputStream fos = null;// 此处为什么放在try的外面？
        try {
            fos = new FileOutputStream(file);
            // fos.write(48);
            // fos.write(56);
            // fos.write('a');
            // fos.write('A');

            String str = "public class hewll";
            byte[] ary = str.getBytes();
            //把字节数组ary,从下标为0位置 开始读取3个字节到文件流
            fos.write(ary, 0, 3);

            fos.flush();// 把内存中的数据，推入磁盘

        } catch (FileNotFoundException e) {

            // Auto-generated catch block
            e.printStackTrace();

        } finally {
            if (fos != null) {
                fos.close();
            }
        }
        LOG.info("完成 文件 的写操作");
    }
}
