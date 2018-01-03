/**
 * Project Name:DT593
 * File Name:Test3.java
 * Package Name:lesson20171228
 * Date:2017年12月28日上午9:44:28
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lesson20171228;

/**
 * Description: <br/>
 * Date: 2017年12月28日 上午9:44:28 <br/>
 * 
 * @author GUO
 * @version
 * @see
 */
public class Test3 {

    public static void main(String[] args) {
        int temp = 1; // 最后一天剩余1个桃子，所以定义temp为1；
        for (int i = 1; i < 10; i++) {
            temp = (temp + 1) * 2; // 已知桃子总数除以2减1这样循环吃9天第10天剩1个桃子；
                                   // 那么第9天得出的桃子数为 （1+1）*2=4个；
                                   // 第9天的桃子+1剩*2以此类推出总桃子数；
        }
        System.out.println("桃子的总数为：" + temp);

    }
}
