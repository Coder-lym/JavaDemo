package OOP;

import java.util.Scanner;

public class workTest {

	public static void work1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入行数：");
		int x = scanner.nextInt();
		System.out.println("请输入列数：");
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
		System.out.println("请输入一个数字：");
		int x = scanner.nextInt();
		for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
				System.out.print(i+"×"+j+"="+i*j+"  ");
			}
            System.out.println();
		}
		scanner.close();
	}
	
	public static int work3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数：");
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
		System.out.println("请输入第一个数：");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int y = scanner.nextInt();
		scanner.close();
		if (x==y) {
			return "两数相等";
		}else {
			return "两数不相等";
		}
	}
	
	public static int work5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int y = scanner.nextInt();
		System.out.println("请输入第三个数：");
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
//		System.out.println("较大数为："+work3());
//		System.out.println(work4());
		System.out.println("最大值为："+work5());
		
	}

}
