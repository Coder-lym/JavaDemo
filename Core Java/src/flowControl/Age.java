package flowControl;
import java.util.Scanner;  //����java��util���µ�Scanner��
public class Age {
public static void main(String[] args) {
	System.out.println("���������䣺");
	Scanner scan=new Scanner(System.in);  //����
	int age=scan.nextInt();               //������������ݣ����洢��age��
	if (age>=18) {
		System.out.println("���ѳ��ꡣ");
	} else {
		System.out.println("����δ�����ˡ�");
	} 
	scan.close();
  }
}
