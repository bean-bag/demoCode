/**
 * Project Name:demoCode
 * File Name:ServerSocketWriteFile.java
 * Package Name:chapter2.demo
 * Date:2018年1月11日下午10:18:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: <br/>
 * Date: 2018年1月11日 下午10:18:23 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class ServerSocketWriteFile {
    private final static Logger LOG = LoggerFactory.getLogger(ServerSocketWriteFile.class);

    /**
     * Socket服务开始端口
     */
    public final static int PORT = 6666;

    public static void main(String[] args) {

        ServerSocket server = null;
        Socket socketServer = null;
        InputStream socketInputStream = null;

        File file = new File("D:/git/demoCode/src/main/java/chapter2/demo/ClientSocketReadFile.java.bak");
        FileOutputStream fileOutputStream = null;
        try {
            server = new ServerSocket(PORT);// 在指定端口PORT，开启Socket服务
            socketServer = server.accept();// Socket服务 等待客户端socket请求

            socketInputStream = socketServer.getInputStream();

            int len = -1;// 定义变量len，初始化值为-1;

            byte[] b = new byte[1024];// 定义容量为1024的字节数据，

            fileOutputStream = new FileOutputStream(file);// 构建文件输出流实例

            // 从文件输入流对象 fis ，读取字节数据到字节数据 b;<br>
            // 读取字节数 <= 字节数组 b的长度<br>
            // 把读取到 字节数组 b 中的实际字节数，赋值给变量 len;<br>
            // 比较 实际读取的字节数 len 是否为 -1,如果为-1,表明已读到文件结尾<br>
            while ((len = socketInputStream.read(b)) != -1) {
                LOG.info("输出内容为：{}", new String(b, 0, len));
                fileOutputStream.write(b, 0, len);
            }

            fileOutputStream.flush();// 当完成socket流的读取，把文件输入流中的数据，推到磁盘。

        } catch (FileNotFoundException e) {
            LOG.info("Socket服务端", e);
        } catch (IOException e) {
            LOG.info("Socket服务端", e);
        } finally {
            CloseHelper.quietClose(fileOutputStream, socketInputStream, socketServer, server);
        }

    }

}
