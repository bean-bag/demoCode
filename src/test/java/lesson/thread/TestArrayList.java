/**
 * Project Name:demoCode
 * File Name:TestArrayList.java
 * Package Name:lesson.thread
 * Date:2018年1月7日下午8:43:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lesson.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午8:43:19 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TestArrayList implements Runnable {

    private List<String> list;

    CountDownLatch cdl;

    public TestArrayList(List<String> list, CountDownLatch cdl) {
        this.list = list;
        this.cdl = cdl;
    }

    /**
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            list.add("a");
        }
        try {
            cdl.countDown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        int count = 32;
        CountDownLatch cdl = new CountDownLatch(count);
        List<String> list = new ArrayList<>();
        TestArrayList t1 = new TestArrayList(list, cdl);
        for (int i = 0; i < count; i++) {
            new Thread(t1).start();
        }
        cdl.await();
        System.out.println("size:" + list.size());
    }
}
