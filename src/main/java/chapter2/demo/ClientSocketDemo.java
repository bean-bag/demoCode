/**
 * Project Name:demoCode
 * File Name:ClientSocketDemo.java
 * Package Name:chapter2.demo
 * Date:2018年1月11日下午4:29:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.demo;

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
public class ClientSocketDemo {
    private final static Logger LOG = LoggerFactory.getLogger(ClientSocketDemo.class);

    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = ServerSocketDemo.PORT;
        Socket client = null;
        OutputStream os = null;
        try {
            InetAddress address = InetAddress.getByName(host);

            client = new Socket(address, port);

            os = client.getOutputStream();

            // String msg = scanner();

            // byte[] b = msg.getBytes();
            byte[] b = "Hello world".getBytes();

            os.write(b);

            // os.flush();

        } catch (UnknownHostException e) {
            LOG.info("Socket客户端", e);
        } catch (IOException e) {
            LOG.info("Socket客户端", e);
        } finally {
            CloseHelper.quietClose(os, client);
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
