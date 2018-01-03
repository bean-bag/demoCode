/**
 * Project Name:demoCode
 * File Name:TestUsb.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午9:38:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 上午9:38:12 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestUsb {

    public static void main(String[] args) {
        
        USB usb = new Mouse();
        
        ///USB usb0= new USB();
        
        System.out.println(usb.tranform());
        
        USB usb2 = new Keyboard();
        
        System.out.println(usb2.tranform());
        
        MobileUsb usb3 = new MobileUsb();
        
       String message  = usb3.call("隔壁老王");
       
       System.out.println(message);

    }

}

