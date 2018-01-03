package demoCode;

/**
 * 
 * @authors ${Chen Yang}
 * @date 2017-12-28 10:17:17
 * @version $Id$
 */
public class Work3 {
    public static void main(String[] args) {
        int a = 1;// 剩下的桃子只有一个
        for (int i = 0; i < 9; i++) {// 第十天只剩下一个，吃了9天，循环9次
            a = (a + 1) * 2;
        }
        System.out.println("猴子第一天一共摘了" + a + "个桃子");
    }
}
