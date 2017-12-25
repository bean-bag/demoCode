/**
 * Project Name:demoCode
 * File Name:School.java
 * Package Name:chapter2.lesson2
 * Date:2017年12月25日上午11:32:16
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson2;
/**
 * Description:   
 * 1、成员变量和局部变量，定义的位置<br>
 * 2、身份决定可被访问的区域
 * <br/>
 * Date:     2017年12月25日 上午11:32:16 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class School {
    String teacher="斌哥";//成员变量

    public static void main(String[] args) {
        
        
        School school = new School();
        
        school.printOut();
        school.classOne();
    }
    
    /**
     * 
     * Description: <br/>
     *
     * @author junwen.bao
     */
    void classOne(){//陆军大院
        String student="张三";//局部变量
        
        System.out.println(teacher +"教学生"+ student +"学java");
    }
   
    void printOut(){//海军大院
        String student = "学生1";
        System.out.println(teacher +"教学生"+ student +"学java");
    }

}

