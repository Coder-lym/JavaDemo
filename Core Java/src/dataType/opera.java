package dataType;

import java.util.Scanner;
public class opera{
	public static void main(String[] args) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);

        System.out.println("�������һ�����֣�");
		num1=scan.nextInt();
		scan.nextLine();
        
        System.out.println("�������������");
		String opera=scan.nextLine();

		System.out.println("������ڶ������֣�");
		num2=scan.nextInt();

		switch (opera) {
		case "+":
			int jia=num1+num2;
			System.out.println("������Ϊ��"+num1+opera+num2+"="+jia);
			break;
		case "-":
			int jian=num1-num2;
			System.out.println("������Ϊ��"+num1+opera+num2+"="+jian);
			break;
		case "*":
			int cheng=num1*num2;
			System.out.println("������Ϊ��"+num1+opera+num2+"="+cheng);
			break;
		case "/":
			int chu=num1/num2;
			System.out.println("������Ϊ��"+num1+opera+num2+"="+chu);
			break;
		default:
			System.out.println("������Ч��");
			break;
		}
        scan.close();
	}
}

