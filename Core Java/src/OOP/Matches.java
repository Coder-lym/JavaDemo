package OOP;

import java.util.Scanner;

public class Matches {
    //身份证号验证（正则表达式）
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入身份证号：");
		String id=scan.next();
		scan.close();
		
		String regex="\\d{17}[0-9xX]";
		if (id.matches(regex)) {
			System.out.println("是身份证号");
		} else {
            System.out.println("不是身份证号");
		}
	}

}
