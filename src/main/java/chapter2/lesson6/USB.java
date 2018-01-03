/**
 * Project Name:demoCode
 * File Name:USB.java
 * Package Name:chapter2.lesson6
 * Date:2018年1月3日上午9:31:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson6;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 上午9:31:19 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public interface USB {

    /**
     * 充电量最大值
     */
    public final static int MAX = 100;
    /**
     * 充电量最小值
     */
    public final static int MIN = 0;
    /**
     * 获取对应的数据
     * Description: <br/>
     *
     * @author junwen.bao
     * @return 返回的数据
     */
    String tranform();
    
    /**
     * 充电
     * Description: <br/>
     *
     * @author junwen.bao
     * @return 充电量
     */
    int charge();
}

