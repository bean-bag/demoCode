/**
 * Project Name:demoCode
 * File Name:SocketDemo.java
 * Package Name:chapter2.lesson10
 * Date:2018年1月10日下午2:59:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson10;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * 服务端：负责开启接受通信数据的一端；
 * 
 * 客户端：负责发送通信数据的一端；
 * 
 * Description: <br/>
 * Date: 2018年1月10日 下午2:59:03 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */

public class ServerSocketDemo {

    public static void main(String[] args) {
        
        
       
        int port = 6666;// 端口值的范围：0 and 65535
        //String host = "baojunwen";
        OutputStream os = null;
        java.net.ServerSocket serversocket = null;
        Socket socket = null;
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream is = null;
        try {
            
            //InetAddress address = InetAddress.getByName(host);
            serversocket = new java.net.ServerSocket(port);
            
            socket = serversocket.accept();

            is = socket.getInputStream();
            
           // os = socket.getOutputStream();

            SocketDemo.printMsg(is);
            
            //SocketDemo.writeMsg(os);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {            
            //先打开的对象（句柄），后关；后打开的，先关            
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
