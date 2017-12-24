/**
 * Project Name:lesson
 * File Name:School.java
 * Package Name:lesson6
 * Date:2017年12月14日下午4:59:24
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson6;
/**
 * Description:   <br/>
 * Date:     2017年12月14日 下午4:59:24 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class School {

    public static void main(String[] args) {

        for(int i=1;i<=7;i++){
            if(i%2==0){
                System.out.println("今天早上不爽！，今天不想上学了");
                continue;                
            }
            System.out.println("第"+i+"天上学去！");
           
        }
    }

}

