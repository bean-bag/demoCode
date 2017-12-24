/**
 * Project Name:lesson
 * File Name:HttpDemo.java
 * Package Name:lesson9
 * Date:2017年12月21日下午3:22:51
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson9;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import sun.net.www.http.HttpClient;

/**
 * Description: <br/>
 * Date: 2017年12月21日 下午3:22:51 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class HttpDemo {

    public static void main(String[] args) {

        try {
            HttpClient hc =  HttpClient.New(new URL("https://github.com/"));
            InputStream is =    hc.getInputStream();
            byte[] b = new byte[1024];
            int length = -1;
            while((length = is.read(b))>-1){
                System.out.println(new String(b,0,length));
            }
        } catch (MalformedURLException e) {

            // Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {

            // Auto-generated catch block
            e.printStackTrace();

        }

    }

}
