/**
 * Project Name:demoCode
 * File Name:TestCar.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月3日上午8:55:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;

/**
 * Description: <br/>
 * Date: 2018年1月3日 上午8:55:20 <br/>
 * 
 * @author junwen.bao
 * @version
 * @see
 */
public class TestCar {

    /**
     * 怎么样实现多态<br>
     * 1、父子类<br>
     * 2、子类需要重写父类的某个方法；<br>
     * 3、 Description: <br/>
     *
     * @author junwen.bao
     * @param args
     */

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.setName("bus");

        Truck truck = new Truck();
        truck.setName("truck");

        bus.getSite();
        truck.getSite();

        /*
         * Bus[] aryBus = new Bus[5];
         * 
         * aryBus[0] = bus; aryBus[1] = truck;
         */

        Car[] aryCar = new Car[5];

        aryCar[0] = bus;
        aryCar[1] = truck;

        for (int i = 0; i < 2; i++) {
            System.out.println(aryCar[i].getName() + "能坐" + aryCar[i].getSite() + "个人");
        }

    }

}
