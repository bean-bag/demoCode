/**
 * Project Name:lesson2
 * File Name:ClassFirst.java
 * Package Name:lesson2
 * Date:2017年12月24日上午9:59:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson1;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 上午9:59:35 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */

//类关键字 class
//类名 ClassFirst

// 类名和和类文件名，是一样的，
// 新建的 类类型
public class Cat {

    //属性
    String color;
    String name;
    int age;    
    
    
    //方法
    //方法名 + (){
      //代码块
    //}
    // void，没有返回值；
    
    /**
     * 吃
     * Description: <br/>
     *
     * @author junwen.bao
     */
    void eat(){
        //void :比较闷的，做了事情 ，没有做反馈；
        System.out.println("吃小鱼干！");
    }
    
    /**
     * 捕捉老鼠
     * Description: <br/>
     *
     * @author junwen.bao
     * @return
     */
    int catchMouse(){
        //捕捉一只老鼠；
        //做出响应，需要用到关键字 return 反回信息;
        return 1;
    }
    
    /**
     * 叫
     * Description: <br/>
     *
     * @author junwen.bao
     */
    void voice(){
        System.out.println("喵喵");
    }
}

