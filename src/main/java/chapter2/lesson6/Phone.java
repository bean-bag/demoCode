/**
 * Project Name:demoCode
 * File Name:Phone.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午9:47:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 上午9:47:12 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public interface Phone {
    
    /**
     * 电话的mac号
     */
    public final static String MAC = "xxx:xxxx";

    /**
     * 
     * 给指定的用户打电话
     * Description: <br/>
     *
     * @author junwen.bao
     * @param who 给谁打
     * @return 说话的内容 
     */
    String call(String who);
    
   
}

