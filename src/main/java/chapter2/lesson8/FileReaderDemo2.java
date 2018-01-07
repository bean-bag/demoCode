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
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 上午11:55:02 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class FileReaderDemo2 {
    private final static Logger LOG = Logger.getLogger(FileReaderDemo2.class);

    public static void main(String[] args) throws IOException {
        // String path = "D:\\fileDirDemo\\Hellosorld.java";
        String path = "E:\\dt59\\homework\\github\\liutao\\src\\main\\java\\dt59homework\\Second.java";// 给path重新赋值；

        File file = new File(path);

        // 局部变量，需要 初始化
        LineNumberReader fis = null;// 此处为什么放在try的外面？
        // 变量在哪个地方申明，就在哪个大括号下面，可以访问
        try {
            fis = new LineNumberReader(new FileReader(file));

            String line = null;
            
            while ((line = fis.readLine()) != null) {
                
                System.out.println(line);
            }
           
        } catch (FileNotFoundException e) {
            LOG.info("fnff", e);
        } catch (IOException e) {
            LOG.info("IO", e);
        } finally {
            if (fis != null) {// 需要判断
                fis.close();
            }
        }

    }

}
