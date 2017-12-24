package chapter1.lesson1;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("欢迎来到中国银行，很高兴为您服务！");

		System.out.println("登录名：");
		System.out.println("密码：");
		Scanner input = new Scanner(System.in);
		String Name = input.next();
		int Password = input.nextInt();
		System.out.println(Name);
		System.out.println(Password);
        if (Name.equals("田永旭") & Password == 123) {// 不知道为什么在控制台不能输入名字？是不是因为Name=="田永旭"这个形式不对；
			System.out.println("登陆成功");
		} else {
			System.out.println("登录失败");
		}
		input.close();
	}
}
