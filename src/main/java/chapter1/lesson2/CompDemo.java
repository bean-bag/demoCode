package chapter1.lesson2;

/**
 * 比较运算示例
 * 
 * @author junwen.bao@airintelli.com
 *
 */
public class CompDemo {

	public static void main(String[] args) {
		double lu_height = 185;
		double chicken_height = 150;

		boolean result = lu_height != chicken_height;
		// 1、比较运算符号：>、 < 、>= 、<=、
		// == 、!=
		// 英文状态下的 小写字符

		// !=
		// <>

		// 2、布尔值的范围：真和假，true 和false;
		// 3、数据存储空间：一个bit位

		System.out.println("卢总是不是比鸡腿哥高：" + result);
	}

}
