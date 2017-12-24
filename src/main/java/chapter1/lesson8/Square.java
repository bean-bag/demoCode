/**
 * Project Name:lesson
 * File Name:Demo2.java
 * Package Name:lesson8
 * Date:2017年12月19日上午11:56:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson8;
/**
 * Description:   <br/>
 * Date:     2017年12月19日 上午11:56:12 <br/>
 * @author   junwen.bao
 * @version
 * @see
 * 
 * TODO bjw
 */
public class Square {

    public static void main(String[] args) {
        int length = 4;
        
        int [][] ary = new int[length][length];
        
        /*for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                int ii = i+1;
                int jj = length-j;
                if(jj<ii){
                    System.out.print(jj);
                }else{
                    System.out.print(ii);
                }
            }
            System.out.println();
        }        
        
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                int ii = length-i;
                int jj = length-j;
                if(jj<ii){
                    System.out.print(jj);
                }else{
                    System.out.print(ii);
                }
            }
            System.out.println();
        }*/
        
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                int ii = i+1;
                int jj = j+1;
                if(jj<ii){
                    System.out.print(jj);
                }else{
                    System.out.print(ii);
                }
            }
            //System.out.println();
            for (int j = 0; j < ary[i].length; j++) {
                int ii = i+1;
                int jj = length-j;
                if(jj<ii){
                    System.out.print(jj);
                }else{
                    System.out.print(ii);
                }
            }
            System.out.println();            
        }
        
        for (int i = 0; i < ary.length*2; i++) {
            /*for (int j = 0; j < ary[i].length*2; j++) {
                int top = Math.abs(length-i);
                int jj = j+1;
                if(jj<top){
                    System.out.print(jj);
                }else{
                    System.out.print(top);
                }
            }*/
            //System.out.println();
            for (int j = 0; j < ary.length*2; j++) {
                int top = length-Math.abs(length-i-1);
                int jj = length-Math.abs(length-j-1);
                if(jj<top){
                    System.out.print(jj);
                }else{
                    System.out.print(top);
                }
            }
            System.out.println();
        }
        
    }

}

