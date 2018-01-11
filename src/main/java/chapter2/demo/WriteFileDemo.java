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
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);//构建文件输出流实例
            /**
             * 1、红十字会发起募捐，准备好了募捐箱 fileOutputStream
             */
            
            /**
             * 2.1、有的人响应募捐，把名下的财产 b ,全部捐给了fos
             */
            //fos.write(b);
            /**
             * 2.2、有的人说：
             * 我留一部分生活费（0~~offset之间的）；
             * 之外的一个亿（length）捐给fileOutputStream ；
             * 如果还有多的，那就不再捐了。
             * 2.3、另一个人说：我也捐一个亿。但他实际财产b，没有一个亿---诈捐。
             * （所以，offset+length 要小于或者等于财产实际总数 b.length）
             */
            fileOutputStream.write(b, offset, length);
            
            //把字节数组b下标offset开始，到下标为 offset+length 位置之间的字节数据，<br>
            //写到文件输出流中
            
        } catch (FileNotFoundException e) {
            LOG.info("写文件示例", e);
        } catch (IOException e) {
            LOG.info("写文件示例", e);
        } finally {
            CloseHelper.quietClose(fileOutputStream);
            /**
             * 3、募捐完成后，要记得关上募捐箱，否则钱被别人拿跑了。
             */
        }
    }

}
