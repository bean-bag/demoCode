/**
 * Project Name:demoCode
 * File Name:MobileUsb.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午9:46:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 上午9:46:00 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class MobileUsb implements USB , Phone {

    @Override
    public String tranform() {
        
        return "图片";
    }

    @Override
    public int charge() {        
        return 100;
    }

    @Override
    public String call(String who) {
        
        
        return "喂，"+who + "您好！你要买房子吗？";
    }

}

