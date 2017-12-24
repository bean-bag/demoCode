/**
 * Project Name:lesson
 * File Name:Character.java
 * Package Name:lesson8
 * Date:2017年12月19日上午10:48:10
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson8;
//别人家的工具，借入到我家使用；
import java.util.Random;

/**
 * Description:   <br/>
 * Date:     2017年12月19日 上午10:48:10 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Character {

    public static void main(String[] args) {

        //字符，可以转换成二进制的数值：010101；
        
        Random random = new Random();
        
        // 
        //ASCII 256个符号 = 2的8次方
        //选中的输出符号：33~126；
        //                33+i~~33+i;
        // 生成从 0~93的随机数；
        
        for(int i=0;i<5;i++){
            //char chr = (char)i;
            int ran = random.nextInt();
                ran = Math.abs(ran);//取绝对值；
                ran = ran%94;//取余数；
                ran = 33 + ran ;//把随机数，移到我们指定的范围之内；
                
            //System.out.print(i+":" + (char)ran +'\t');
            System.out.print((char)ran);
            
//            if(ran%94 == 0){
//                System.out.println();
//            }
        }
        
        

    }

}

