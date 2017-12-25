/**
 * Project Name:demoCode
 * File Name:ZhaZhiJi.java
 * Package Name:chapter2.lesson2
 * Date:2017年12月25日上午11:51:02
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
// 

//


/**/
package chapter2.lesson2;
//import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 上午11:51:02 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ZhaZhiJi {
    
    

    public static void main(String[] args) {
        ZhaZhiJi zzj = new ZhaZhiJi();
        
        //String apple = "香蕉";
        //String 是一个类，右边是String类对象
        String apple = new String("梨");
        //char apple ='梨';
        //调用方法的过程，点榨汁机按钮榨汁的过程，
        //客户在使用榨汁机：
        //appler :实参：实际上的参数
       String glass = zzj.zhaZhi3("2",apple);
       
       System.out.println("榨出来了“"+glass+"”");
       //1、形参和实参的数据类型必须一致
       //2、形参，形式上的约定的（一个类），实参是具体的对象
       //3、实参的变量名，随意的；形参的变量名，也是随意的；形参和实参的名字可以不一样    
       //4、实参和形参的个数，必须一样：对就的参数类型，也必须一致
       //5、各个参数对应的意义必须一样
    }

    /**
     * 定义方法：生产厂商，生产榨汁机的过程；
     * Description: <br/>
     *
     * @author junwen.bao
     * @param fruit //形参：形式上的参数
     * @return
     */
    String zhaZhi(String fruit){
        return fruit + "汁";
    }
    
    String zhaZhi2(String fruit,int count){
        return count + "杯"+fruit + "汁";
    }
    
    /**
     * 多个参数之间用 逗号分隔
     * Description: <br/>
     *
     * @author junwen.bao
     * @param fruit
     * @param count
     * @return
     */
    String zhaZhi3(String fruit,String count){
        return count + "杯"+fruit + "汁";
    }
}

