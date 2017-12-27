/**
 * Project Name:demoCode
 * File Name:Person.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月26日上午11:43:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月26日 上午11:43:35 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Person {

    private int credit;
    
    void fuzhiCredite(int credit){
        if(credit>60){
            System.out.println("可以贷款");
        }else{
            System.out.println("不能借款");
        }
    }
}

