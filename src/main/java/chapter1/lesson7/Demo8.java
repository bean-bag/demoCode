/**
 * Project Name:lesson
 * File Name:Demo8.java
 * Package Name:lesson7
 * Date:2017年12月17日下午4:25:15
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;

import java.util.Random;

/**
 * Description:   <br/>
 * Date:     2017年12月17日 下午4:25:15 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Demo8 {

    public static void main(String[] args) {

        Random rand = new Random();
        String[] chars = new String[]{"a","b","c","d","e"};

        
        String var = "";
        for(int i=0;i<5;i++){
            int iRan = Math.abs(rand.nextInt())%5;
            var = var +chars[iRan];            
        }
        
        System.out.println(var);
    }

}

