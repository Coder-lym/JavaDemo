package OOP;

import java.util.Scanner;

public class Matches {
    //���֤����֤��������ʽ��
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("���������֤�ţ�");
		String id=scan.next();
		scan.close();
		
		String regex="\\d{17}[0-9xX]";
		if (id.matches(regex)) {
			System.out.println("�����֤��");
		} else {
            System.out.println("�������֤��");
		}
	}

}
