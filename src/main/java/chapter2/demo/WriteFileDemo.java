/**
 * Project Name:demoCode
 * File Name:WriteFileDemo.java
 * Package Name:chapter2.demo
 * Date:2018年1月11日上午1:03:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: <br/>
 * Date: 2018年1月11日 上午1:03:31 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class WriteFileDemo {

    private final static Logger LOG = LoggerFactory.getLogger(WriteFileDemo.class);

    public static void main(String[] args) {

    }

    public void writeFile(String filePath, byte[] b, int offset, int length) {
        File file = new File(filePath);//构建文件对象
        
        this.writeFile(file, b, offset, length);
    }

    public void writeFile(File file, byte[] b, int offset, int length) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);//构建文件输出流实例
            
            fos.write(b);//
            fos.write(b, offset, length);
            
            //把字节数组b下标offset开始，到下标为 offset+length 位置之间的字节数据，<br>
            //写到文件输出流中
            
        } catch (FileNotFoundException e) {
            LOG.info("写文件示例", e);
        } catch (IOException e) {
            LOG.info("写文件示例", e);
        } finally {
            CloseHelper.quietClose(fos);
        }
    }

}
