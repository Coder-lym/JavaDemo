package OOP;

import java.util.Scanner;

public class yanzhengCode {

	public static final String DATA = "ABCDEFGHJKLMNPQRSTUVWXYabcdefghijklmnpqrstuvwxy3456789";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������֤�볤�ȣ�");
		int a = sc.nextInt();
		sc.nextLine();

		String code = yanzhengCode.creatCode(a);
		System.out.println(code);
		System.out.println("��������֤�룺");
		String input = sc.nextLine();

		// �Ա���֤���Ƿ���ȷ
		boolean isOK = false;
		while (!isOK) {
			if (input.equalsIgnoreCase(code)) {
				System.out.println("������ȷ��");
				isOK=true;
			} else {
				System.out.println("��������");
				code = yanzhengCode.creatCode(a);
				System.out.println(code);
				System.out.println("�����������֤�룺");
				input = sc.nextLine();
			}
		}

	}

	// �÷��������֤��λ���󣬷�����֤�루�ַ�����
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
