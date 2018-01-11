/**
 * Project Name:demoCode
 * File Name:ClientSocketDemo.java
 * Package Name:chapter2.demo
 * Date:2018年1月11日下午4:29:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: <br/>
 * Date: 2018年1月11日 下午4:29:46 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class ClientSocketReadFile {
    private final static Logger LOG = LoggerFactory.getLogger(ClientSocketReadFile.class);

    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = ServerSocketDemo.PORT;
        Socket socketClient = null;
        OutputStream socketOutputStream = null;

        File file = new File("D:/git/demoCode/src/main/java/chapter2/demo/ClientSocketReadFile.java");
        FileInputStream fileInputStream = null;
        try {
            InetAddress address = InetAddress.getByName(host);

            socketClient = new Socket(address, port);

            socketOutputStream = socketClient.getOutputStream();

            // String msg = scanner();

            // byte[] b = msg.getBytes();
            // byte[] b = "Hello world".getBytes();

            // os.write(b);
            fileInputStream = new FileInputStream(file);// 构建文件输入流对象

            int len = -1;// 定义变量len，初始化值为-1;

            byte[] b = new byte[1024];// 定义容量为1024的字节数据，

            // 从文件输入流对象 fis ，读取字节数据到字节数据 b;<br>
            // 读取字节数 <= 字节数组 b的长度<br>
            // 把读取到 字节数组 b 中的实际字节数，赋值给变量 len;<br>
            // 比较 实际读取的字节数 len 是否为 -1,如果为-1,表明已读到文件结尾<br>
            while ((len = fileInputStream.read(b)) != -1) {
                LOG.info("输出内容为：{}", new String(b, 0, len));
                socketOutputStream.write(b, 0, len);
            }

            socketOutputStream.flush();

        } catch (UnknownHostException e) {
            LOG.info("Socket客户端", e);
        } catch (IOException e) {
            LOG.info("Socket客户端", e);
        } finally {
            CloseHelper.quietClose(fileInputStream, socketOutputStream, socketClient);
        }
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        } finally {
            CloseHelper.quietClose(scanner);
        }
    }
}
