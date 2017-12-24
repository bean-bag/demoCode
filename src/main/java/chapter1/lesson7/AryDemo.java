/**
 * Project Name:lesson
 * File Name:AryDemo.java
 * Package Name:lesson7
 * Date:2017年12月17日上午10:52:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson7;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月17日 上午10:52:37 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class AryDemo {

    public static void main(String[] args) {

        int[] ary = new int[] { 8, 4, 2, 1, 23, 344, 12 };
        
//        for(int i=0;i<ary.length;i++){
//            System.out.println(ary[i]);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想查找的数字：");
            if(scanner.hasNextInt()){
                int num = scanner.nextInt();
                boolean flag = false; 
                for(int i=0;i<ary.length;i++){
                    int tmp = ary[i];
                    if(tmp == num){
                        System.out.println("输入的数字在当前数组中！");
                        flag = true;
                        break;//跳出当前循环
                    }
                }
                
                
                
                //if(i==ary.length){
                if(!flag){
                    System.out.println("你输入的数字（"+num+"）不存在该数组中");
                }
            }else{
                System.out.println("请输入一个整数！");
            }
        scanner.close();
        
        // + 算法运算符；
        // + 连字符（连接字符串）；
        
//        System.out.println(12+":\t"+'$'+100);
//        System.out.println(12+":\t"+"$"+100);
//        System.out.println(12+':'+'\t'+"$"+100);
        System.out.println(12+':');
        System.out.println(12+':'+'\t');
        //char类型与数值型的数据，相加，“+”号是运算符；
        
        System.out.println(12+':'+'\t'+"$");
        //数值型数据，与字符串，相加，“+”号是连字符，此时，数值会默认的转换为字符串；
        
        System.out.println(12+':'+'\t'+"$"+100);
        
        
        System.out.println(12+":"+'\t'+"$");
        
    }

}
