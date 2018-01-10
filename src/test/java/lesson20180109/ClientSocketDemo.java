/**
 * Project Name:demoCode
 * File Name:ClientSocketDemo.java
 * Package Name:Test
 * Date:2018年1月9日下午4:59:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson20180109;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2018年1月9日 下午4:59:04 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class ClientSocketDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Socket socket = null;
        OutputStream os = null;
        InputStream is = null;
        try {
            socket = new Socket(InetAddress.getByName("localhost"), 9999);
            // socket.bind(new
            // InetSocketAddress(InetAddress.getByName("localhost"), 9999));
            // socket.connect(endpoint, timeout);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            os.write("Hello,how are you!".getBytes());

            int len = -1;
            byte[] b = new byte[1024];
            while ((len = is.read(b)) != -1) {
                System.out.println("Server:>" + new String(b, 0, len));
                System.out.print("Meeeee:>");
                
                
                String msg = scanner.next();

                os.write(msg.getBytes());
                // os.write("my name is Limei".getBytes());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
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
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            scanner.close();
        }

    }

}
