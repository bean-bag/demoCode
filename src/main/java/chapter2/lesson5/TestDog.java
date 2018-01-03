/**
 * Project Name:demoCode
 * File Name:TestDog.java
 * Package Name:chapter2.lesson5
 * Date:2018年1月2日上午9:53:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package chapter2.lesson5;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 上午9:53:19 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class TestDog {

    public static void main(String[] args) {

      Dog dog =  new Dog();
      
      Pet petDog = dog;//向父级转换｜向上转换
      
      
      //Pet pet = new Pet();//抽象的类实例
      
      if( petDog instanceof Dog){
          Dog dogPet = (Dog) petDog;//强制转换｜向下转换
          System.out.println("petDog 是一只狗" );
      }else if( petDog instanceof Cat){
          System.out.println("petDog 是一只猫" );
      }else{
          //System.out.println("");
          System.out.println("petDog 不是一只狗，也不是猫" );
      }
      
      Pet petCat = new Cat();
      
      petCat.setGender("公");
      
      Cat cat1 = (Cat)petCat;
      
     if( petCat instanceof Cat){
         
         System.out.println("当前实例是一只猫");
     }
      
      cat1.setFoodFish("鱼");
      
      System.out.println("猫吃："+ cat1.getFood());
      
      double d = 12D;
      int i;
      
      i = (int)d;////强制转换
    }

}

