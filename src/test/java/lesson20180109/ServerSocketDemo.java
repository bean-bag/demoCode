/**
 * Project Name:demoCode
 * File Name:ServerSocketDemo.java
 * Package Name:Test
 * Date:2018年1月9日下午4:38:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson20180109;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月9日 下午4:38:33 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class ServerSocketDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        ServerSocket ss = null;
        InputStream is = null;
        OutputStream os = null;
        
        System.out.println("等待客户端请求消息。。。");
        try {
            ss = new ServerSocket(9999);
            Socket socket = ss.accept();

            is = socket.getInputStream();
            
            os = socket.getOutputStream();
            int len = -1;
            byte[] b = new byte[1024];
            while ((len = is.read(b)) != -1) {
                System.out.println("Client:>"+new String(b, 0, len));
                System.out.print("Meeeee:>");
                String msg = scanner.next();

                os.write(msg.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            scanner.close();
        }
    }

}
