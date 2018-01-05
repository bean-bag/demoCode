import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Project Name:demoCode
 * File Name:ForEachDemo.java
 * Package Name:
 * Date:2018年1月5日下午5:55:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2018年1月5日 下午5:55:23 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class ForEachDemo {

    public static void main(String[] args) {

        String[] ary = new String[] { "sdf", "sfd", "sdf" };

        List<String> list = new ArrayList<String>();
        // list.add(1);
        // list.add(new ForEachDemo());
        // list.add(true);
        list.add("saff1");
        list.add("saff2");
        list.add("saff3");
        
        // 反射
        
        
        // Object obj = new ForEachDemo();
        
        
        for (Object obj : new HashMap().entrySet()) {

            System.out.println(obj);
            break;
        }

    }

}
