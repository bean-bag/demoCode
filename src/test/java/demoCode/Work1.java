package demoCode;

/**
 * 
 * @authors ${Chen Yang}
 * @date    2017-12-28 09:26:10
 * @version $Id$
 */
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("请输入第一个数据");
            double a = scan.nextDouble();

            System.out.println("请入第二个数据");
            double b = scan.nextDouble();
            System.out.println("请输入运算符号+-*/中的一个");
            String option = scan.next();
            switch (option) {
            case "+":
                a = a + b;
                System.out.println(a);
                break;
            case "-":
                a = a - b;
                System.out.println(a);
                break;
            case "*":
                a = a * b;
                System.out.println(a);
                break;
            case "/":
                a = a / b;
                System.out.println(a);
                break;
            }
        }
    }
}