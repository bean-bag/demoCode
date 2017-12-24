/**
 * Project Name:lesson
 * File Name:Bobble.java
 * Package Name:lesson8
 * Date:2017年12月19日下午12:09:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson8;
/**
 * Description:   <br/>
 * Date:     2017年12月19日 下午12:09:55 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Bobble {

    public static void main(String[] args) {

        int[] ary = new int[]{12,14,2,5,7,98}; 
        //找最大值和最小值；
        int max = ary[0];
        int min = ary[0];
//        
//        for (int i = 0; i < ary.length; i++) {
//            if(max <ary[i]){
//                max = ary[i];
//            }
//            
//            if(min > ary[i]){
//                min = ary[i];
//            }
//        }
        
        for(int i=0;i<ary.length-1;i++){//3：第三个点
            //1：此处为什么需要是ary.length-1
            //4：此处为什么需要是ary.length-1-i
            for (int j = 0; j < ary.length-1-i; j++) {
               // i : ary.length-1;
               // i+1:ary.length； 
//                int cur = ary[i];//当前元素
//                int next = ary[i+1];//获取下一个元素
                if(ary[j]<ary[j+1]){
//                if(cur < next){//
                    //不做任何操作，
                }else{
                    //2：交换位置；
                    int tmp = ary[j];
                    
                    ary[j]= ary[j+1];
                    
                    ary[j+1]= tmp;
                }
            }
        }
        
        for (int i = 0; i < ary.length; i++) {
            System.out.println(">>");
            System.out.println(ary[i]);            
        }
        
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        
        
        
    }

}

