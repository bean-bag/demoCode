/**
 * Project Name:demoCode
 * File Name:Dog.java
 * Package Name:chapter2.lesson4
 * Date:2017年12月28日下午3:12:47
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package chapter2.lesson4;
/**
 * Description:   <br/>
 * Date:     2017年12月28日 下午3:12:47 <br/>
 * @author   junwen.bao
 * @version
 * @see
 */
public class Dog extends Pet {
    
    public Dog(){
        //this();
        super();
    }
    
     String voice;
    
    private String kind;

    public String getVoice() {
        //super(1);//在方法调用父级的构造是错误的
        
        //可以通过super的方法
        //char gender1 = super.getGender();
        
        //char gender2 = getGender();
        
        //System.out.println(" : " + gender2);
        
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    
    

}

