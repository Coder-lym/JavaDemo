package flowControl;
import java.util.Scanner;
public class Cashier {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("��������Ʒ���ۣ�");
	double unitprice=scan.nextDouble();
	
	System.out.println("������������");
	double amount=scan.nextDouble();
	
	System.out.println("�������");
	double money=scan.nextDouble();
	scan.close();
	
	double total=unitprice*amount;  
	
	if (total>=100) {
		total *= 0.8;    //��100�������
	}
    if (money>=total) {
		double little = money-total;
		System.out.println("Ӧ�ս�"+total+",���㣺"+little);
	}else {
		System.out.println("Ӧ�ս�"+total+" ��Ǹ��������Ǯ������");
	}
	
  }
}
