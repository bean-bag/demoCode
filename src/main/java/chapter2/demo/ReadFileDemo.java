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
        FileInputStream fileInputStream = null;
        
        try {
            fileInputStream = new FileInputStream(file);//构建文件输入流对象
            /**
             * 1、打开文件读取的水龙头；
             */
            
            int len = -1;//定义变量len，初始化值为-1;
            
            
            byte[] b = new byte[1024];//定义容量为1024的字节数据，
            /**
             * 2、准备一个能装1024个字节的水瓢,（如果有钱人，可以用一个大瓢；如果穷人，只能用更小的瓢---瓢可大可小，看情况）
             * 3、用水瓢从水龙头中接水，（水很珍贵，所以尽量不要装满，否则一不小心就洒了）
             * 4、水龙头中的水比较多，所以需要多次接水（使用循环）
             * 5、用来装水的水瓶资源有限，要根据瓢中的水有多少，选择多大的水瓶（需要测量每瓢水实际装了多少---len）。
             * 6、如果接不到水（返回 -1），说明水接完了。
             */
            
            //从文件输入流对象 fileInputStream ，读取字节数据到字节数据 b;<br>
            //读取字节数 <= 字节数组 b的长度<br>
            //把读取到 字节数组 b 中的实际字节数，赋值给变量 len;<br>
            //比较 实际读取的字节数 len 是否为 -1,如果为-1,表明已读到文件结尾<br>
            while((len = fileInputStream.read(b))!=-1){
                LOG.info("输出内容为：{}", new String(b,0,len));
            }            
        } catch (FileNotFoundException e) {
            LOG.info("读文件示例", e);
        } catch (IOException e) {
            LOG.info("读文件示例", e);
        }finally{
            CloseHelper.quietClose(fileInputStream);
            /**
             * 7、水接完了，别忘记关水龙头，
             */
        }
    }
    
    /**
     * 
     */
}
