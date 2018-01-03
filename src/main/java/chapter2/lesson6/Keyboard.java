/**
 * Project Name:demoCode
 * File Name:Keyboard.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午9:37:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 上午9:37:43 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Keyboard implements USB {

    @Override
    public String tranform() {        
        return "abcd";
    }

    @Override
    public int charge() {
        return 0;
    }

}

