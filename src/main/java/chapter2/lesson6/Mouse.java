/**
 * Project Name:demoCode
 * File Name:Mouse.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午9:35:08
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 上午9:35:08 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Mouse implements USB{

    @Override
    public String tranform() {
        return "x:0,y:0";
    }

    @Override
    public int charge() {
        
        return 0;
    }

}

