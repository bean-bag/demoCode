/**
 * Project Name:lesson
 * File Name:CmdCls.java
 * Package Name:lesson9
 * Date:2017年12月20日上午9:12:13
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter1.lesson9;

import java.io.IOException;

/**
 * Description:   <br/>
 * Date:     2017年12月20日 上午9:12:13 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class CmdCls {

    public static void main(String[] args) throws IOException {

       for(int i=0;i<30;i++){
           System.out.println(i);
       }
       
       //Runtime.getRuntime().exec(new String[]{"cmd.exe","/C","cls"});
      new ProcessBuilder("cmd","/C","cls").inheritIO().start();
       //System.out.println(p.toString());
    }

}

