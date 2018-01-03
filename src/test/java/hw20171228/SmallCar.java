/**
 * Project Name:dt59homework
 * File Name:SmallCar.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:01:35
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:01:35 <br/>
 * @author   Wu zhen
 * @version
 * @see
 */
public class SmallCar extends Car {
         
          private String brand;
          private int seat;
          
          public SmallCar(String brand,int seat,String type,String color){    
              //super(type);调用父类的构造方法,只能用super,且只能是第一行；
              this.setType(type);
              this.setColor(color);//可用this调用父类的公开权限的方法；
              this.seat=seat;
              this.brand=brand;     
              System.out.println("这是一辆"+color+"的"+brand+type+seat+"人车！");
          }
          public void summary(){
              System.out.println("这是一辆私家车！");
          }
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public int getSeat() {
            return seat;
        }
        public void setSeat(int seat) {
            this.seat = seat;
        }
  
}

