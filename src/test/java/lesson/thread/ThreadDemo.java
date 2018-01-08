/**
 * Project Name:demoCode
 * File Name:ThreadDemo.java
 * Package Name:lesson.thread
 * Date:2018年1月7日上午10:48:55
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread;
/**
 * Description:   <br/>
 * Date:     2018年1月7日 上午10:48:55 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class ThreadDemo {

    public static void main(String[] args) {
//        testRunnable();
        testSync();
    }
    public static void testThread(){
        for(int i=0;i<10;i++){
            new FirstThread("Thread "+i).start();
        }

    }
    public static void testRunnable(){
        for(int i=0;i<10;i++){
            Thread thread = new Thread(new FirstRunnable(i));
            if(i%2==0){
                thread.setPriority(Thread.NORM_PRIORITY);
            }
            thread.start();
        }

    }
    
    public static void testSync(){
        for(int i=0;i<10;i++){
            Thread thread = new Thread(new SyncDemo(i));
            if(i%2==0){
                thread.setPriority(Thread.NORM_PRIORITY);
            }
            thread.start();
        }

    }
}

