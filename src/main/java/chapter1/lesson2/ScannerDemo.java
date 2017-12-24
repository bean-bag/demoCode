package chapter1.lesson2;

//类似于配置环境变量
//引入类文件
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// int num = 123;
		// String name = "123";
		// System

		// System.out.println(x);
		// System.in;
		System.out.println("请输入圆的半径：");

		// 数据的输入源是System.in;
		// Scanner 包装数据输入源，提供获取各类型的数据方法；
		Scanner scanner = new Scanner(System.in);

		// 取数据值的方式
		// String str = scanner.next();
		int r = scanner.nextInt();
		// scanner.nextBoolean();
		// scanner.nextDouble();
		// scanner.nextLong();

		// System.out.println("你的用户名为：" + str);
		System.out.println("半径为：" + r);
		// 关闭
		scanner.close();
	}

}
