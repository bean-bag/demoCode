/**
 * Project Name:demoCode
 * File Name:ReadFileDemo.java
 * Package Name:chapter2.demo
 * Date:2018年1月11日上午12:39:49
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: <br/>
 * Date: 2018年1月11日 上午12:39:49 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class ReadFileDemo {
    private final static Logger LOG = LoggerFactory.getLogger(ReadFileDemo.class);
    
    public static void main(String[] args) {

    }

    public void readFile(String filePath) {
        File file = new File(filePath);
        this.readFile(file);
    }

    public void readFile(File file) {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream(file);//构建文件输入流对象
            
            int len = -1;//定义变量len，初始化值为-1;
            
            byte[] b = new byte[1024];//定义容量为1024的字节数据，            
            
            //从文件输入流对象 fis ，读取字节数据到字节数据 b;<br>
            //读取字节数 <= 字节数组 b的长度<br>
            //把读取到 字节数组 b 中的实际字节数，赋值给变量 len;<br>
            //比较 实际读取的字节数 len 是否为 -1,如果为-1,表明已读到文件结尾<br>
            while((len = fis.read(b))!=-1){
                LOG.info("输出内容为：{}", new String(b,0,len));
            }            
        } catch (FileNotFoundException e) {
            LOG.info("读文件示例", e);
        } catch (IOException e) {
            LOG.info("读文件示例", e);
        }finally{
            CloseHelper.quietClose(fis);
        }
    }
}
