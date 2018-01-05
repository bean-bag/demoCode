/**
 * Project Name:demoCode
 * File Name:JNC.java
 * Package Name:
 * Date:2018年1月5日下午6:27:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description:   <br/>
 * Date:     2018年1月5日 下午6:27:34 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class JNC extends Wine {

    public void out(String str) {       
        //super.out();
        System.out.println("JNC.out");
    }
    
    @Override
    public void child(){
        System.out.println("JNC.child");
    }
}

