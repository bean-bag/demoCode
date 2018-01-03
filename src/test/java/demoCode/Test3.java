/**
 * Project Name:data1
 * File Name:Test3.java
 * Package Name:data2
 * Date:2017年12月28日上午9:56:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package demoCode;
/**
 * Description:   <br/>
 * Date:     2017年12月28日 上午9:56:43 <br/>
 * @author   tianyongxu
 * @version
 * @see
 */
public class Test3 {

    public static void main(String[] args) {
        int peach=1;
        //int count=1;//因为循环只走了9次，所以把最后一天的桃子数先加上来；
        for(int i=1;i<10;i++){
            peach=2*(peach+1);//反着计算；
            //count =count+peach;
            System.out.println(peach);
        }
        System.out.println("猴子第一天摘了"+peach+"个桃子。");

    }

}

