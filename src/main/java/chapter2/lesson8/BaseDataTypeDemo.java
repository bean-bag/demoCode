package chapter2.lesson8;
/**
 * Project Name:demoCode
 * File Name:BaseDataTypeDemo.java
 * Package Name:
 * Date:2018年1月6日上午9:07:56
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 上午9:07:56 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class BaseDataTypeDemo {
    private final static Logger LOG = Logger.getLogger(BaseDataTypeDemo.class);

    public static void main(String[] args) {

        int intData = 1;
        short shortData = 1;
        Short shortClass;
        long longData = 1;
        Long longClass;
        byte byteData = 127, bd2 = -128;
        Byte byteClass;
        
        float floatData = 1.0f;
        double doubleData = 1.0;
        char charData = 'a', cd2 = 97;
        boolean booleanData = true;

        String str;// 类类型

        Integer intClass = new Integer(0);
        Object obj = new Object();
        
        LOG.info("Object:" + obj);
        LOG.info("intClass:" + intClass);
        
        char chr = (char)3;
        int i = 5;
        int iVal = chr + i;
        
        //int intVal = intClass + 1;//
        //int intVal1 = intClass.intValue() + 1;//系统自动做这个处理--拆箱
        int intA = 1+1;
        Integer intB  = 1+1;
        int intVal1 = intClass + 1;//系统自动做这个处理--拆箱
        Integer intVal2 = intClass + 1;//系统自动做这个处理--装箱
        
        LOG.info("intClass+1:" + intVal1);
    }

}
