package OOP;

import java.util.Scanner;

public class yanzhengCode {

	public static final String DATA = "ABCDEFGHJKLMNPQRSTUVWXYabcdefghijklmnpqrstuvwxy3456789";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入验证码长度：");
		int a = sc.nextInt();
		sc.nextLine();

		String code = yanzhengCode.creatCode(a);
		System.out.println(code);
		System.out.println("请输入验证码：");
		String input = sc.nextLine();

		// 对比验证码是否正确
		boolean isOK = false;
		while (!isOK) {
			if (input.equalsIgnoreCase(code)) {
				System.out.println("输入正确！");
				isOK=true;
			} else {
				System.out.println("输入有误！");
				code = yanzhengCode.creatCode(a);
				System.out.println(code);
				System.out.println("请继续输入验证码：");
				input = sc.nextLine();
			}
		}

	}

	// 该方法获得验证码位数后，返回验证码（字符串）
	public static String creatCode(int a) {
		char[] arr = new char[a];
		for (int i = 0; i < arr.length; i++) {
			char code = DATA.charAt((int) (Math.random() * DATA.length()));
			arr[i] = code;
		}
		String str = new String(arr);
		return str;
	}
}
