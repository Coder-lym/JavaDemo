package dataType;

import java.util.Scanner;
public class opera{
	public static void main(String[] args) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);

        System.out.println("请输入第一个数字：");
		num1=scan.nextInt();
		scan.nextLine();
        
        System.out.println("请输入运算符：");
		String opera=scan.nextLine();

		System.out.println("请输入第二个数字：");
		num2=scan.nextInt();

		switch (opera) {
		case "+":
			int jia=num1+num2;
			System.out.println("运算结果为："+num1+opera+num2+"="+jia);
			break;
		case "-":
			int jian=num1-num2;
			System.out.println("运算结果为："+num1+opera+num2+"="+jian);
			break;
		case "*":
			int cheng=num1*num2;
			System.out.println("运算结果为："+num1+opera+num2+"="+cheng);
			break;
		case "/":
			int chu=num1/num2;
			System.out.println("运算结果为："+num1+opera+num2+"="+chu);
			break;
		default:
			System.out.println("输入无效！");
			break;
		}
        scan.close();
	}
}

