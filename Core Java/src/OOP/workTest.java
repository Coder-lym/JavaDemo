package OOP;

import java.util.Scanner;

public class workTest {

	public static void work1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������");
		int x = scanner.nextInt();
		System.out.println("������������");
		int y = scanner.nextInt();
		for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
				System.out.print("*");
			}
            System.out.println();
		}
		scanner.close();
	}
	
	public static void work2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int x = scanner.nextInt();
		for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
				System.out.print(i+"��"+j+"="+i*j+"  ");
			}
            System.out.println();
		}
		scanner.close();
	}
	
	public static int work3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = scanner.nextInt();
		System.out.println("������ڶ�������");
		int y = scanner.nextInt();
		scanner.close();
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	
	public static String work4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = scanner.nextInt();
		System.out.println("������ڶ�������");
		int y = scanner.nextInt();
		scanner.close();
		if (x==y) {
			return "�������";
		}else {
			return "���������";
		}
	}
	
	public static int work5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ������");
		int x = scanner.nextInt();
		System.out.println("������ڶ�������");
		int y = scanner.nextInt();
		System.out.println("���������������");
		int z = scanner.nextInt();
		scanner.close();
		
		if (x > y) {
			return x > z ? x : z;
		} else {
			return y > z ? y : z;
		}
	}
	
	
	public static void main(String[] args) {
//		work1();
//      work2();
//		System.out.println("�ϴ���Ϊ��"+work3());
//		System.out.println(work4());
		System.out.println("���ֵΪ��"+work5());
		
	}

}
