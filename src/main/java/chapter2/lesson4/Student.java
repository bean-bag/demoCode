/**
 * Project Name:demoCode
 * File Name:ZhangSan.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午6:54:57
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;
/**
 * Description:   <br/>
 * Date:     2017年12月28日 下午6:54:57 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Student extends Human {

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void brain() {        
        System.out.println("学习");        
    }
    
    
}

