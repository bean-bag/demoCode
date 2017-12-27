/**
 * Project Name:demoCode
 * File Name:Lion.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月27日上午8:40:05
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 上午8:40:05 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ConstructorDemo {
    String name;
    char gender;
    int age;
    
    
    public ConstructorDemo(){
        
    }

    /**
     * 狮子出生的时候
     * Creates a new instance of Lion.
     *
     * @param gender
     */
    public ConstructorDemo(String gender) {
//        this.gender = gender;
        
        if(gender != null){
            //charAt(int index): 取出字符串的第一个字符
            this.gender = gender.charAt(0);
        }
        //setGender(gender);
    }
    
    
    /**
     * 动物园养狮子的时候
     * Creates a new instance of Lion.
     *
     * @param name
     * @param gender
     */
    public ConstructorDemo(String name, String gender) {
        this(gender);//构造的调用，必须在当前构造方法的第一句；
        //; 空的语句在调用其它构造方法前也不行
        this.name = name;
        //new this(gender); 错误的写法，不需要加new 关键字
        //this 指的当前类
        //this.gender = gender;
        //setGender(gender);
        
//        if(gender != null){
//            //charAt(int index): 取出字符串的第一个字符
//            this.gender = gender.charAt(0);
//        }
    }

    /**
     * 狮子过了一个生日后
     * Creates a new instance of Lion.
     *
     * @param name
     * @param gender
     * @param age
     */
    public ConstructorDemo(String name, String gender, int age) {
        this(name, gender);//重载第二个构造
        //this.name = name;
        //this.gender = gender;
        //setGender(gender);
        this.age = age;
    }
    
    /**
     * 普通 的设值方法
     * Description: <br/>
     *
     * @author junwen.bao
     * @param gender
     */
    private void setGender(String gender){
        if(gender != null){
            //charAt(int index): 取出字符串的第一个字符
            this.gender = gender.charAt(0);
        }
    }
    
    
}

