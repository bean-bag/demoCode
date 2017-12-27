/**
 * Project Name:demoCode
 * File Name:Construt.java
 * Package Name:chapter2.lesson3
 * Date:2017年12月26日上午9:44:07
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson3;
/**
 * Description:   <br/>
 * Date:     2017年12月26日 上午9:44:07 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Dog {
    
    final static String kind = "犬科";
    
    String name = "旺才1号";//成员变量|类变量
    String color;
    int age;
    char gender;

    /**
     * 第一个构造方法：无参数构造：<br>
     * 
     * 修饰符 （没有返回值类型定义） 方法与类名相同 （）{}<br>
     * Creates a new instance of Construt.
     *
     */
    public Dog(){
        //String name;//局部变量
        name="旺才";
        age = 1;
        gender ='公';
    }
    
    
    /**
     * 构造方法的重载：两个方相同，参数个数不同、类型不同、顺序不同（参数类型）；
     * Creates a new instance of Dog.
     *
     * @param name1
     * @param age
     */
    public Dog(String name1, int age){
        gender ='公';
        name = name1;
        //“这个”类:Dog
        this.age = age;
    }
    
    public Dog(int age,String name1){
        gender ='公';
        name = name1;
        //“这个”类:Dog
        this.age = age;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public void eat(){
        System.out.println("肉和"+this.love());
    }
    
    private String love(){
        return "骨头";
    }
    
//错误演示  
//    public Dog(String arg1, String arg2) {
//        this.name = name;
//        this.color = color;
//    }
    /**
     * 静态方法内，不能直接访问类的成员属性及方法
     * Description: <br/>
     *
     * @author junwen.bao
     */
    public static void showColor(){
        //this.name;
        System.out.println();
    }
    
    public static void showAge(){
        //this.name;
        showColor();
        
        System.out.println(kind);
    }
}

