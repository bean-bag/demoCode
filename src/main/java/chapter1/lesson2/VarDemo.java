package chapter1.lesson2;

public class VarDemo {

	public static void main(String[] args) {

		//final double PI = 3.1415926;

		// PI = 3.14;

//		int money;
//		money = 1000;
//
//		// 长整型
//		long l = 1000;// 1、占用多少字节？//徐超，2、取值范围
//
//		short s = 1000;

		//
		// System.out.println(money);

		// int money2 = 1000;

		// System.out.println(money2);

//		String name = "张三";
//
//		/// boolean
//		char sex = '男';
		//
		// System.out.println("姓名：" + "name");
		// System.out.println("姓名：" + name);
		// System.out.println("性别：" + sex);
		// System.out.println("工资：" + money);

		int i = 100;
		System.out.println("整数(i) ：" + i);
		double d = 100.499;
		// 默认是双精度；
		// 双精度

//		float f = (float) 100.499;
//
//		float f1 = 100.499f;
//		float f2 = 100.499F;

		// 单精度

		System.out.println("小数(d) ：" + d);
		// i = d;

		// d = i;// 自动数据类型转换；

		// 从低精度，可以自动转换成高精度；

		// System.out.println("小数(d=i) ：" + d);

		i = (int) d;

		// 强制类型转换
		System.out.println("整数(i=d) ：" + i);

		// byte b;
	}

}
