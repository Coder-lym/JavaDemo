package dataType;

import java.util.Scanner;
public class Max {
	public static int getMax(int a,int b,int c) {
		if (a>b) {
			return (a>c ? a : c);
		} else {
			return (b>c ? b : c);
		}	
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    System.out.println("�������һ������");
	    int a=scanner.nextInt();
	    System.out.println("������ڶ�������");
	    int b=scanner.nextInt();
	    System.out.println("���������������");
	    int c=scanner.nextInt();
	    scanner.close();
	    System.out.println(getMax(a, b, c));
	}
}
