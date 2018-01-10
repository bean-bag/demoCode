/**
 * Project Name:demoCode
 * File Name:SocketDemo.java
 * Package Name:chapter2.lesson10
 * Date:2018年1月10日下午2:59:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson10;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Description: <br/>
 * Date: 2018年1月10日 下午2:59:03 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class SocketDemo {

    public static void main(String[] args) {

        int port = 6666;// 端口值的范围：0 and 65535
        String host = "baojunwen";// locahost|127.0.0.1约定的指本机
        OutputStream os = null;
        InputStream is = null;
        Socket socket = null;
        try {
            InetAddress address = InetAddress.getByName(host);
            
            socket = new Socket(address, port);

            
            os = socket.getOutputStream();

            SocketDemo.writeMsg(os);
            
            socket.shutdownInput();
            
            is = socket.getInputStream();
            
            //SocketDemo.printMsg(is);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 先打开的对象（句柄），后关；后打开的，先关
            close(os);
            
            close(is);

            close(socket);
        }

    }

    public static void writeMsg(OutputStream os) throws IOException{
        
        os.write("HelloWorld".getBytes());

        os.flush();
    }
    
    public static void printMsg(InputStream is) throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        
        int b = -1;
        while ((b = is.read()) != -1) {
            baos.write(b);
        }

        byte[] byteAry = baos.toByteArray();

        String str = new String(byteAry);

        System.out.println(str);
    }
    
    public static void close(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Closeable is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
